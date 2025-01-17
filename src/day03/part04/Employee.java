package day03.part04;

import java.time.LocalDate;

//class employee encapsulation as Parent Class
public class Employee extends Person {
    private int empId;
    private LocalDate birthDay;
    private LocalDate joinDate;
    private double salary;
    private String role;
    private String status;
    private double totalSalary;

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Employee(int empId,String firstName, String lastName, LocalDate birthDay, double salary) {
        super(firstName, lastName);
        this.empId = empId;
        this.birthDay = birthDay;
        this.salary = salary;
    }

    //default/empty constructor




    @Override
    public String toString() {
        return super.toString() +
                "empId=" + empId +
                ", birthDay=" + birthDay +
                ", salary=" + salary +
                ", totalSalary=" + totalSalary +
                '}';
    }

    //polymorphism
    //overloading methods
    public String getInfo(){
        return toString();
    }

    public String getInfo(double salary){
        return toString()+" salary : "+salary;
    }

    public double getInfo(String firstName){
        return 0.0;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }


    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    @Override
    public String infoPerson() {
        return "";
    }
}
