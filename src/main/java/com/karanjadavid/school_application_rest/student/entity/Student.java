package com.karanjadavid.school_application_rest.student.entity;


import com.karanjadavid.school_application_rest.lib.entity.Person;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Student extends Person {

    @Enumerated(EnumType.STRING)
    private StudentStatus studentStatus;

    @OneToMany
    private List<Person> parents = new ArrayList<>();

    public long getStudentId(){
        return getId() + 1000;
    }
}
