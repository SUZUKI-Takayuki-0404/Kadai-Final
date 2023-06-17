package com.example.demo.response;

import com.example.demo.entity.PrefectureEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Setter
@Getter
public class AllPrefectureResponse {
    private String message;
    private List<PrefectureEntity> prefectureEntityList;
}
