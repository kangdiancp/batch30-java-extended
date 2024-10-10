package day03.part05;

public class Main {
    public static void main(String[] args) {
        //call interface & implementation
        HRInterface hrInterface = new HRImplementation();
        // init employees
        var listOfEmp = hrInterface.initialListEmployees();

        //print out
        hrInterface.printEmployee(listOfEmp);

    }
}
