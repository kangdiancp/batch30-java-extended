package day03.part04;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // initial object encapsulation



        Permanent emp1 = new Permanent(122,"Widi","wini", LocalDate.of(1998, Month.APRIL,12),6_000,200,100,0);
        Permanent emp2 = new Permanent(123,"Rini","maharni",LocalDate.of(1998, Month.APRIL,12),5_000,200,100,0);

        Contract emp3 = new Contract(124,"yuli","yuni",LocalDate.of(1998, Month.APRIL,12),5000,100);
        Contract emp4 = new Contract(125,"yuli","sara",LocalDate.of(1998, Month.APRIL,12),5000,100);

        //cast from permanent to employee -polymorphism
        Employee emp5 = emp1;

        List<Employee> listEmployee= List.of(emp1,emp2,emp3,emp4);

        for (Employee emps : listEmployee) {
            System.out.println(emps.toString());
        }
    }
}
