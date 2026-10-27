package com.karanjadavid.school_application_rest.lib.form;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PersonEditForm extends SessionUserIdForm{
    private String name;
    private String email;
    private String phoneNumber;
    private String Address;
    private LocalDate birthDate;
}
