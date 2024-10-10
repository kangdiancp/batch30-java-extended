package day03.part04;

import java.time.LocalDate;

public class Permanent extends Employee {
    private double tjgMedical;
    private double bpjs;
    private double bonus;

    public Permanent(int empId,String firstName, String lastName,  String firstName1, String lastName1, LocalDate birthDay, double salary) {
        super( empId,firstName, lastName, firstName1, lastName1, birthDay, salary);
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
