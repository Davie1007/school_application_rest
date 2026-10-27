package com.karanjadavid.school_application_rest.lib.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Getter
@Setter
@Entity
public abstract class Person extends BaseJpaEntity{
    private String Name;
    private String email;
    private String phoneNumber;
    private String Address;
    private LocalDate birthDate;

    public short getAge() {
        if (birthDate == null || birthDate.isAfter(LocalDate.now())) {
            return -1;
        }
        return (short) ChronoUnit.YEARS.between(this.birthDate, LocalDate.now());
    }
}
