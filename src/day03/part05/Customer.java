package day03.part05;

public class Customer extends Person {
    private int custId;
    private String address;

    public Customer(String firstName, String lastName) {
        super(firstName, lastName);
    }


    @Override
    public String infoPerson() {
        return "";
    }
}