package day03.part05;

import java.util.List;

public interface HRInterface {
    public List<Employee> initialListEmployees();
    public double getTotalSalary(List<Employee> employees);
    public void printEmployee(List<Employee> employees);
}
