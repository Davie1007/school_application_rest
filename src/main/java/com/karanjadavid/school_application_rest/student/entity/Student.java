package com.karanjadavid.school_application_rest.student.entity;


import com.karanjadavid.school_application_rest.lib.entity.Person;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Student extends Person {

    private List<Person> parents = new ArrayList<>();

    public long getStudentId(){
        return getId() + 1000;
    }
}
