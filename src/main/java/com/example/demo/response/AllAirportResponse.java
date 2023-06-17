package com.example.demo.response;

import com.example.demo.entity.AirportEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Setter
@Getter
public class AllAirportResponse {
    private String message;
    private List<AirportEntity> airportEntityList;
}
