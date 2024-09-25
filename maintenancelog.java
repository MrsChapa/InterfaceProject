import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Create an instance of the maintenancelog class
        maintenancelog carLog = new maintenancelog();

        // Prompt the user for car details
        System.out.print("Enter car make: ");
        String make = scnr.nextLine();
        carLog.setMake(make);

        System.out.print("Enter car model: ");
        String model = scnr.nextLine();
        carLog.setModel(model);

        System.out.print("Enter car year: ");
        int year = scnr.nextInt();
        carLog.setYear(year);

        System.out.print("Enter VIN (as a number): ");
        int VIN = scnr.nextInt();
        carLog.setVIN(VIN);

        System.out.print("Enter car mileage: ");
        int mileage = scnr.nextInt();
        carLog.setMileage(mileage);

        // Print the maintenance log
        carLog.printlog();

        // Close the scanner
        scnr.close();
    }
}
