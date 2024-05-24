package com.example.hr_system.entities;

import com.example.hr_system.enums.SalaryType;
import com.example.hr_system.enums.TypeOfEmployment;
import com.example.hr_system.enums.Valute;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "salaries")
public class Salary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private SalaryType salaryType;

    private double salarySum;
    @Enumerated(EnumType.STRING)
    private Valute valute;

    @OneToOne(mappedBy = "salary")
    private Vacancy vacancy;
}
