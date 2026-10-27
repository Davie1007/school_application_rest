package com.karanjadavid.school_application_rest.student.controller;

import com.karanjadavid.school_application_rest.student.entity.Student;
import com.karanjadavid.school_application_rest.student.form.StudentEditForm;
import com.karanjadavid.school_application_rest.student.form.StudentRegistrationForm;
import com.karanjadavid.school_application_rest.student.service.StudentEditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class StudentController {

    private StudentEditService studentEditService;

    @PostMapping("/register")
    public ResponseEntity<Student> registerStudent(@RequestBody StudentRegistrationForm form) {
        var student = studentEditService.registerStudent(form);
        return ResponseEntity.status(HttpStatus.CREATED).body(student);
    }

    @PutMapping("/edit/{studentId}")
    public ResponseEntity<Student> editStudent(@PathVariable String studentId, @RequestBody StudentEditForm form){
        var student = studentEditService.editStudent(studentId, form);
        return ResponseEntity.status(HttpStatus.OK).body(student);
    }

    @DeleteMapping("/delete/{studentId}")
    public ResponseEntity<Void> deleteStudent(@PathVariable String studentId) {
        studentEditService.delete(studentId, "yty");
        return ResponseEntity.noContent().build();
    }

    @Autowired
    public void setStudentEditService(StudentEditService service){
        this.studentEditService = service;
    }

}
