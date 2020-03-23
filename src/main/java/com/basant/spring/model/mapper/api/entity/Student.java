package com.basant.spring.model.mapper.api.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class Student {

    private String name;
    private int age;
    private String city;
    private LocalDate dateOfBirth;
}
