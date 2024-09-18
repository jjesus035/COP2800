import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a binary string
        System.out.print("Input: " );
        String binaryString = scanner.nextLine();
        
        if (!isValidBinaryString(binaryString)) {
            System.out.println("Invalid binary string. Please enter a string of 1 to 16 0's and 1's.");
            scanner.close();
            return;
        }

        int number = Integer.parseInt(binaryString, 2);

        printOctal(number);

        printDecimal(number);

        printHexadecimal(number);

        scanner.close();
    }
    /**
     * Validates the binary string.
     * @param binaryString the binary string to validate
     * @return true if the string is a valid binary string, false otherwise
     */
    private static boolean isValidBinaryString(String binaryString) {
        return binaryString.matches("[01]{1,16}");
    }
    /**
     * Prints the octal representation of the given number with position and value.
     * @param number the integer to be converted and printed
     */
    private static void printOctal(int number) {
        String octalString = Integer.toOctalString(number);

        int placeValue = 1;
        for (int i = octalString.length() - 1; i >= 0; i--) {
            char digit = octalString.charAt(i);
            System.out.printf("%-8d%-8c%n", placeValue, digit);
            placeValue *= 8;
        }
        System.out.println("Octal: " + octalString + "\n");
    }
    /**
     * Prints the decimal representation of the given number with position and value.
     * @param number the integer to be converted and printed
     */
    private static void printDecimal(int number) {
        String decimalString = Integer.toString(number);

        int placeValue = 1;
        for (int i = decimalString.length() - 1; i >= 0; i--) {
            char digit = decimalString.charAt(i);
            System.out.printf("%-8d%-8c%n", placeValue, digit);
            placeValue *= 10;
        }
        System.out.println("Decimal: " + decimalString + "\n");
    }
    /**
     * Prints the hexadecimal representation of the given number with position and value.
     * @param number the integer to be converted and printed
     */
    private static void printHexadecimal(int number) {
        String hexString = Integer.toHexString(number).toUpperCase();

        int placeValue = 1;
        for (int i = hexString.length() - 1; i >= 0; i--) {
            char digit = hexString.charAt(i);
            System.out.printf("%-8d%-8c%n", placeValue, digit);
            placeValue *= 16;
        }
        System.out.println("Hexadecimal: " + hexString + "\n");
    }
}
