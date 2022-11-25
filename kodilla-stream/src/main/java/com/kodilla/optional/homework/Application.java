package com.kodilla.optional.homework;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        Teacher teacher = new Teacher("Teacher");
        students.add(new Student("Mark", new Teacher("JohnTeacher")));
        students.add(new Student("Alice", null));
        students.add(new Student("John", new Teacher("BenTeacher")));
        students.add(new Student("Samantha", teacher));
        students.add(new Student("Betty", null));

        Teacher defaultTeacher = new Teacher("<undefined>");
//        for (Student student : students) {
//            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
//            System.out.println("Uczeń: " + student.getName()
//                    + ", nauczyciel: " + optionalTeacher.orElse(defaultTeacher).getName());
//        }

//        for (Student student : students) {
//            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
//            String resultTeacher = optionalTeacher.isPresent() ? student.getTeacher().getName() : "<undefined>";
//            System.out.println("Uczeń: " + student.getName() + ", nauczyciel: " + resultTeacher);
//        }
        // które z tych rozwiązań jest lepsze?

        for(Student student : students){
            System.out.println("Uczeń: " + student.getName()
                    + ", nauczyciel: " + Student.getTeacherName(student));
        }
    }
}
