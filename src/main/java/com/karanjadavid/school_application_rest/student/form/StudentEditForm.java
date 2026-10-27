package com.karanjadavid.school_application_rest.student.form;

import com.karanjadavid.school_application_rest.lib.entity.Person;
import com.karanjadavid.school_application_rest.lib.form.PersonEditForm;
import com.karanjadavid.school_application_rest.student.entity.StudentStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class StudentEditForm extends PersonEditForm {
    private List<Person> parents = new ArrayList<>();
}
