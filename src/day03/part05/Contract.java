package day03.part05;

import java.time.LocalDate;

public class Contract extends Employee {
    private double parkir;

    public Contract(int empId, String firstName, String lastName, LocalDate birthDay, double salary, double parkir) {
        super(empId, firstName, lastName, birthDay, salary);
        this.parkir = parkir;
    }

    @Override
    public String toString() {
        return super.toString() +
                "parkir=" + parkir +
                '}';
    }
}
