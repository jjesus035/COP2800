import java.util.Scanner;

//Date: 09/09/2024
//Class: COP2800
//Author: Juan Jesus
public class UnitConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unit Conversion");
        System.out.println("Choose a conversion type:");
        System.out.println("1. Inches to feet");
        System.out.println("2. Feet to inches");
        System.out.println("3. Cubits to steps");
        System.out.println("4. Steps to cubits");
        System.out.println("5. Yards to miles");
        System.out.println("6. Miles to yards");

        System.out.print("Enter your choice (1, 2, 3, 4, 5, 6): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                convertInches(scanner);
                break;
            case 2:
                convertFoot(scanner);
                break;
            case 3:
                convertCubits(scanner);
                break;
            case 4:
                convertSteps(scanner);
                break;
            case 5:
                convertYards(scanner);
                break;
            case 6:
                convertMiles(scanner);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    private static void convertInches(Scanner scanner) {
        System.out.print("Enter measurement in inches: ");
        double inches = scanner.nextDouble();
        double feet = inches / 12; // 12 inches = 1 foot
        System.out.printf("%.2f inches is equal to %.2f feet.\n", inches, feet);
    }

    private static void convertFoot(Scanner scanner) {
        System.out.print("Enter measurement in foots: ");
        double foot = scanner.nextDouble();
        double inches = (foot * 12); // 1 foot = 12 inches
        System.out.printf("%.2f foot is equal to %.2f inches.\n", foot, inches);
    }

    private static void convertCubits(Scanner scanner) {
        System.out.print("Enter measurement in cubits: ");
        double cubits = scanner.nextDouble();
        double steps = cubits * 0.6; // 1 cubit = 0.6 steps
        System.out.printf("%.2f cubits is equal to %.2f steps.\n", cubits, steps);
    }

    private static void convertSteps(Scanner scanner) {
        System.out.print("Enter measurement in steps: ");
        double steps = scanner.nextDouble();
        double cubits = steps * 1.6667; // 1 step = 1.6667 cubit
        System.out.printf("%.2f steps is equal to %.4f cubits.\n", steps, cubits);
    }

    private static void convertYards(Scanner scanner) {
        System.out.print("Enter measurement in yards: ");
        double yards = scanner.nextDouble();
        double miles = yards * 0.0006; // 1 yard = 0.0006 miles
        System.out.printf("%.2f yards is equal to %.4f miles.\n", yards, miles);
    }

    private static void convertMiles(Scanner scanner) {
        System.out.print("Enter measurement in miles: ");
        double miles = scanner.nextDouble();
        double yards = miles * 1760; // 1 miles = 1760 yards
        System.out.printf("%.2f miles is equal to %.2f yards.\n", miles, yards);
    }

}
