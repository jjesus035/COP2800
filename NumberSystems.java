public class NumberSystems {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java NumberSystems <binaryStrings>");
            return;
        }
        String binaryStrings = args[0];
        if (binaryStrings.length() > 16) {
            System.out.println("Binary string length exceeds 16");
            return;
        }
        int parsedValue = Integer.parseInt(binaryStrings, 2);
        System.out.println("Binary " + Integer.toBinaryString (parsedValue));
        System.out.println("Decimal " + parsedValue) ;
        System.out.println("Octal " + Integer.toOctalString(parsedValue));
        System.out.println("Hexadecimal " + Integer.toHexString(parsedValue));
    }
}
