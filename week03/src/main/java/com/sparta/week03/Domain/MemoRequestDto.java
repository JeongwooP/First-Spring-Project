package com.sparta.week03.Domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Setter
@Getter
public class MemoRequestDto {
    private final String username;
    private final String contents;
}
