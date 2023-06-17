package com.example.demo.response;

import com.example.demo.entity.PrefectureEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class PrefectureResponse {
    private String message;
    private PrefectureEntity prefectureEntity;
}
