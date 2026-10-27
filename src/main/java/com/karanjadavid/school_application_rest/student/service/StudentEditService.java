package com.karanjadavid.school_application_rest.student.service;

import com.karanjadavid.school_application_rest.lib.service.BaseJpaEditService;
import com.karanjadavid.school_application_rest.student.entity.Student;
import com.karanjadavid.school_application_rest.student.form.StudentEditForm;
import com.karanjadavid.school_application_rest.student.form.StudentRegistrationForm;
import com.karanjadavid.school_application_rest.student.repository.StudentRepository;

public class StudentEditService extends BaseJpaEditService<Student, StudentRepository> {

    public Student registerStudent(StudentRegistrationForm form){
        var student = new Student();
        mapFields(student, form);
        return save(student, form.getSessionUserId());
    }

    public Student editStudent(String studentId, StudentEditForm form){
        var student = findByEntityId(studentId);
        mapFields(student, form);
        return save(student, form.getSessionUserId());
    }

    private void mapFields(Student student, StudentEditForm form){
        student.setName(form.getName());
        student.setEmail(form.getEmail());
        student.setPhoneNumber(form.getPhoneNumber());
        student.setAddress(form.getAddress());
        student.setBirthDate(form.getBirthDate());
        student.setParents(form.getParents());
    }

}
