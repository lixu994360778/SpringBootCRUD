package com.in28minutes.springboot.jpa.hibernate.h2.example.student;

public class StudentNotFoundException extends RuntimeException {

    public StudentNotFoundException(String exception) {
        super(exception);
    }

}
