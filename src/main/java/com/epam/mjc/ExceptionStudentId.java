package com.epam.mjc;

public class ExceptionStudentId extends IllegalArgumentException{
    public ExceptionStudentId(long id) {
        super("Could not find student with ID " + id);
    }
}
