package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = createStudentList();

        for (Student student : students) {
            String studentName = student.getName();
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String teacherName = optionalTeacher.map(Teacher::getName).orElse("<undefined>");

            System.out.println("Uczeń: " + studentName + ", nauczyciel: " + teacherName);
        }
    }

    static List<Student> createStudentList() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jan Kowalski"));
        students.add(new Student("Anna Nowak"));
        students.add(new Student("Piotr Wiśniewski"));
        students.add(new Student("Maria Kowalczyk"));
        return students;
    }
}
