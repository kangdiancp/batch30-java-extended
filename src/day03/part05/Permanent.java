package day03.part05;

import java.time.LocalDate;

public class Permanent extends Employee {
    private double tjgMedical;
    private double bpjs;
    private double bonus;

    public Permanent(int empId, String firstName, String lastName, LocalDate birthDay, double salary, double tjgMedical, double bpjs, double bonus) {
        super(empId, firstName, lastName, birthDay, salary);
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
