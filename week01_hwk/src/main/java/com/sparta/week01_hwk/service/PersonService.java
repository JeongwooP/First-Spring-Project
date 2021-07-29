package com.sparta.week01_hwk.service;

import com.sparta.week01_hwk.models.PersonRepository;
import com.sparta.week01_hwk.models.PersonRequestDto;
import com.sparta.week01_hwk.models.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service // PersonService 이 클래스는 서비스임을 명시
public class PersonService {
    // final: 서비스에게 꼭 필요한 녀석임을 명시
    private final PersonRepository personRepository;

    // 생성자를 통해, Service 클래스를 만들 때 꼭 Repository를 넣어주도록
    // 스프링에게 알려줌

    @Transactional // SQL 쿼리가 일어나야 함을 스프링에게 알려줌
    public Long update(Long id, PersonRequestDto requestDto) {
        Person course1 = personRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
        );
        course1.update(requestDto);
        return course1.getId();
    }
}