import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Mean");
            System.out.println("8. Variance");
            System.out.println("9. Exit");

            int choice = 0;
            boolean validInput = false;


            while (!validInput) {
                try {
                    System.out.print("Enter your choice: ");
                    choice = scanner.nextInt();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    scanner.next();
                }
            }

            CalculatorOperations.performOperation(choice);

            if (choice == 9) {
                exit = true;
            }


            scanner.nextLine();
        }

        scanner.close();
    }
}




