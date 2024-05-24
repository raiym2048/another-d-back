package com.example.hr_system.dto.education;

import com.example.hr_system.enums.Education;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
@Getter
@Setter
public class EducationResponse {

    private Long id;

    private String education;
    private String university;
    private String endMonth;
    private String endYear;
    private boolean isStudying;
}
