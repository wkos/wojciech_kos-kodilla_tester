package com.kodilla.abstracts.homework;

public class TestJob {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(1500, "English language teaching");
        Person personTeacher = new Person("Marek", 35, teacher);
        System.out.println(personTeacher.getFirstName()
                + " ma "
                + personTeacher.getAge()
                + " lat i zakres obowiązków: "
                + personTeacher.getResponsibilities());
        Fireman fireman = new Fireman(1800, "fire extinguisher testing");
        Person personFireman = new Person("Ala", 28, fireman);
        System.out.println(personFireman.getFirstName()
                + " ma "
                + personFireman.getAge()
                + " lat i zakres obowiązków: "
                + personFireman.getResponsibilities());
    }
}
