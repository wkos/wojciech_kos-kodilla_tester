package com.kodilla.optional.homework;

import java.util.Optional;

public class Student {
    private String name;
    private Teacher teacher;

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public static String getTeacherName(Student student){
        Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
        return optionalTeacher.orElse(new Teacher("<undefined>")).getName();
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
