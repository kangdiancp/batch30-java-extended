package day03.part04;

public class Contract extends Employee {
    private double parkir;

    public Contract(int empId, String firstName, String lastName, double salary, double parkir) {
        super(empId, firstName, lastName, salary);
        this.parkir = parkir;
    }

    @Override
    public String toString() {
        return super.toString() +
                "parkir=" + parkir +
                '}';
    }
}
