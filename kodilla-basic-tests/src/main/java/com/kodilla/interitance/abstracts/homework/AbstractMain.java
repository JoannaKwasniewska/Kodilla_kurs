package com.kodilla.interitance.abstracts.homework;


import com.kodilla.interitance.abstracts.homeworkjob.Person;
import com.kodilla.interitance.abstracts.homeworkjob.Secretary;
import com.kodilla.interitance.abstracts.homeworkjob.Teacher;

public class AbstractMain {
    public static void main(String[] args) {
       // Kwadrat kw = new Kwadrat(5);
       // System.out.println(kw.obw());
        //System.out.println(kw.pole());
       // Trojkat tr;
       // tr = new Trojkat(5, 3, 6, 7);
       // System.out.println(tr.obw());
        //System.out.println(tr.pole());
        Teacher teacher = new Teacher(5000, "As a teacher, I teach my students maths and physics.");
        Secretary secretary = new Secretary(4000, "As a secretary I pickup the phones and arrange a business meeting.");

        Person jan = new Person("Jan Kowalski", 33, teacher);
        jan.showResponsibilities();
        jan.showSalary();

        Person ania = new Person("Ania Kowalska", 40, secretary);
        ania.showResponsibilities();
        ania.showSalary();
    }
}
