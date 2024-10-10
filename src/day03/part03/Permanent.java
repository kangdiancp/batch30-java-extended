package day03.part03;

import day03.part03.Employee;

public class Permanent extends Employee {
    private double tjgMedical;
    private double bpjs;
    private double bonus;

    public Permanent(int empId, String firstName, String lastName, double salary, double tjgMedical, double bpjs, double bonus) {
        super(empId, firstName, lastName, salary);
        this.tjgMedical = tjgMedical;
        this.bpjs = bpjs;
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString()+ "Permanent{" +
                "tjgMedical=" + tjgMedical +
                ", bpjs=" + bpjs +
                ", bonus=" + bonus +
                '}';
    }
}
