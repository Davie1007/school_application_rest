package com.karanjadavid.school_application_rest.educator.entity;

import com.karanjadavid.school_application_rest.lib.entity.Employee;
import com.karanjadavid.school_application_rest.lib.entity.Person;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
public class Educator extends Person implements Employee {

    @Override
    public void receiveSalary() {

    }

    @Override
    public BigDecimal salary() {
        return null;
    }

    @Override
    public void conductWork() {

    }

    @Enumerated(EnumType.STRING)
    private EducatorLevel educatorLevel;

}
