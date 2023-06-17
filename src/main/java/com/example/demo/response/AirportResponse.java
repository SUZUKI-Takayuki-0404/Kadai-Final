package com.example.demo.response;

import com.example.demo.entity.AirportEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class AirportResponse {
    private String message;
    private AirportEntity airportEntity;
}
