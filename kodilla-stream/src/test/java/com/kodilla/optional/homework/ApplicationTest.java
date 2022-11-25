package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {
    @Test
    public void testStudentsTeacherName(){
        //given
        Student student = new Student("Mark", new Teacher("teacher"));
        //when
        String resultName = Student.getTeacherName(student);
        //given
        String expectedTeacherName = "teacher";
        assertEquals(expectedTeacherName, resultName );
    }

    @Test
    public void testNullStudentsTeacherName(){
        //given
        Student student = new Student("John", null);
        //when
        String resultName = Student.getTeacherName(student);
        //given
        String expectedTeacherName = "<undefined>";
        assertEquals(expectedTeacherName, resultName);
    }
}