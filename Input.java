import java.util.Scanner;
public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static double getDouble() {
        return scanner.nextDouble();
    }

    public static int getInt() {
        return scanner.nextInt();
    }

    public static String getString() {
        return scanner.next();
    }

    public static void closeScanner() {
        scanner.close();
    }
}
