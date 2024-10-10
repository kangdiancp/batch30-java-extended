package day03.part03;

import java.time.LocalDate;

//class employee encapsulation as Parent Class
public class Employee {
    private int empId;
    private String firstName;
    private String lastName;
    private LocalDate birthDay;
    private LocalDate joinDate;
    private double salary;
    private String role;
    private String status;
    private double totalSalary;

    //default/empty constructor
    public Employee(){}

    //overloading constructor
    public Employee(int empId,String firstName,double salary){
        this.empId = empId;
        this.firstName=firstName;
        this.salary = salary;
    }

    public Employee(int empId,String firstName,String lastName,double salary){
        this.empId = empId;
        this.firstName=firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public Employee(int empId,String firstName,String lastName,LocalDate birthDay,double salary){
        this.empId = empId;
        this.firstName=firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.salary = salary;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDay=" + birthDay +
                ", salary=" + salary +
                ", totalSalary=" + totalSalary +
                '}';
    }



    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
}
