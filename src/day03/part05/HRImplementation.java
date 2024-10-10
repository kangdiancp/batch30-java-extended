package day03.part05;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class HRImplementation implements HRInterface{
    @Override
    public List<Employee> initialListEmployees() {
        Permanent emp1 = new Permanent(122,"Widi","wini", LocalDate.of(1998, Month.APRIL,12),6_000,200,100,0);
        Permanent emp2 = new Permanent(123,"Rini","maharni",LocalDate.of(1998, Month.APRIL,12),5_000,200,100,0);

        Contract emp3 = new Contract(124,"yuli","yuni",LocalDate.of(1998, Month.APRIL,12),5000,100);
        Contract emp4 = new Contract(125,"yuli","sara",LocalDate.of(1998, Month.APRIL,12),5000,100);

        return List.of(emp1,emp2,emp3,emp4);
    }

    @Override
    public double getTotalSalary(List<Employee> employees) {
        double totalSalary =0.0;
        for (Employee emp : employees){
            totalSalary+= emp.getTotalSalary();
        }
        return totalSalary;
    }

    @Override
    public void printEmployee(List<Employee> employees) {
        for (Employee emp : employees){
            System.out.println(emp.toString());
        }
    }
}
