package day03.part02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // initial object encapsulation
        Employee emp1 = new Employee();
        emp1.setEmpId(120);
        emp1.setFirstName("andika");
        emp1.setSalary(5_000);
        emp1.setLastName("juna");

        Employee emp2 = new Employee();
        emp2.setEmpId(121);
        emp2.setFirstName("budi juna");
        emp2.setSalary(6_000);

        Employee emp3 = new Employee(122,"Widi",5_000);
        Employee emp4 = new Employee(123,"rini","marini",5_500);
        Employee emp5 = new Employee(124,"yuli","yulia", LocalDate.of(2002,12,12),5_000);

        List<Employee> listEmployee= List.of(emp1,emp2,emp3,emp4,emp5);

        for (Employee emps : listEmployee){
            System.out.println(emps.toString());
        }

       // Employee.calcTotalSalary(emp1);
    }
}
