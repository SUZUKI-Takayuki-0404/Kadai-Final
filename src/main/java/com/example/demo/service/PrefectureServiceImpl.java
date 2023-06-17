package com.example.demo.service;

import com.example.demo.entity.PrefectureEntity;
import com.example.demo.exceptionhandler.CodeInUseException;
import com.example.demo.exceptionhandler.DuplicateCodeException;
import com.example.demo.exceptionhandler.NoResourceException;
import com.example.demo.exceptionhandler.SameAsCurrentException;
import com.example.demo.mapper.AirportMapper;
import com.example.demo.mapper.PrefectureMapper;
import lombok.AllArgsConstructor;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PrefectureServiceImpl implements PrefectureService {

    private final PrefectureMapper prefectureMapper;

    private final AirportMapper airportMapper;

    @Override
    public PrefectureEntity getPrefByCode(String prefCode) {
        return prefectureMapper
                .selectPrefByCode(prefCode)
                .orElseThrow(() -> new NoResourceException(prefCode + " : This code is not found"));
    }

    @Override
    public PrefectureEntity getPrefByName(String prefName) {
        return prefectureMapper
                .selectPrefByName(prefName)
                .orElseThrow(() -> new NoResourceException(prefName + " : This name is not found"));
    }

    @Override
    public List<PrefectureEntity> getAllPrefs() {
        return prefectureMapper.selectAllPrefs();
    }

    @Override
    public PrefectureEntity createPref(String prefCode, String prefName) {
        try {
            prefectureMapper.insertPref(prefCode, prefName);
        } catch (DuplicateKeyException e) {
            throw new DuplicateCodeException(prefCode + " : This code will be duplicated", e);
        }
        return new PrefectureEntity(prefCode, prefName);
    }

    @Override
    public void updatePref(String prefCode, String prefName) {
        PrefectureEntity prefectureEntity = prefectureMapper
                .selectPrefByCode(prefCode)
                .orElseThrow(() -> new NoResourceException(prefCode + " : This code is not found"));

        if (prefectureEntity.getPrefName().equals(prefName)) {
            throw new SameAsCurrentException(prefName + " : Current name will be nothing updated");
        } else {
            prefectureMapper.updatePref(prefCode, prefName);
        }
    }

    @Override
    public void deletePref(String prefCode) {
        String prefName = prefectureMapper
                .selectPrefByCode(prefCode)
                .orElseThrow(() -> new NoResourceException(prefCode + " : This code is not found"))
                .getPrefName();

        if (airportMapper.selectAirportsByPrefName(prefName).isEmpty()) {
            prefectureMapper.deletePref(prefCode);
        } else {
            throw new CodeInUseException(prefCode + " : This code is in use");
        }
    }
}
