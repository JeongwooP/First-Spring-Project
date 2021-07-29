package com.sparta.week01_hwk.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Setter
@Getter
public class PersonRequestDto {
    private final String name;
    private final int age;
    private final String address;
    private final String job;
}