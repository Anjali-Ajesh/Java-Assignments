public class CalculatorOperations {
    public static void performOperation(int choice) {
        double num1, num2;
        switch (choice) {
            case 1:
                System.out.print("Enter first number: ");
                num1 = Input.getDouble();
                System.out.print("Enter second number: ");
                num2 = Input.getDouble();
                System.out.println("Result: " + Calculator.add(num1, num2));
                break;
            case 2:
                System.out.print("Enter first number: ");
                num1 = Input.getDouble();
                System.out.print("Enter second number: ");
                num2 = Input.getDouble();
                System.out.println("Result: " + Calculator.subtract(num1, num2));
                break;
            case 3:
                System.out.print("Enter first number: ");
                num1 = Input.getDouble();
                System.out.print("Enter second number: ");
                num2 = Input.getDouble();
                System.out.println("Result: " + Calculator.multiply(num1, num2));
                break;
            case 4:
                System.out.print("Enter numerator: ");
                num1 = Input.getDouble();
                System.out.print("Enter denominator: ");
                num2 = Input.getDouble();
                System.out.println("Result: " + Calculator.divide(num1, num2));
                break;
            case 5:
                System.out.print("Enter number: ");
                num1 = Input.getDouble();
                System.out.println("Result: " + Calculator.sqrt(num1));
                break;
            case 6:
                System.out.print("Enter base: ");
                num1 = Input.getDouble();
                System.out.print("Enter exponent: ");
                num2 = Input.getDouble();
                System.out.println("Result: " + Calculator.power(num1, num2));
                break;
            case 7:
                System.out.print("Enter number of elements: ");
                int n = Input.getInt();
                double[] numbers = new double[n];
                System.out.println("Enter the numbers:");
                for (int i = 0; i < n; i++)
                    numbers[i] = Input.getDouble();
                System.out.println("Mean: " + Calculator.mean(numbers));
                break;
            case 8:
                System.out.print("Enter number of elements: ");
                n = Input.getInt();
                numbers = new double[n];
                System.out.println("Enter the numbers:");
                for (int i = 0; i < n; i++)
                    numbers[i] = Input.getDouble();
                System.out.println("Variance: " + Calculator.variance(numbers));
                break;
            case 9:
                System.out.println("Exiting...");
                Input.closeScanner();
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 9.");
        }
    }
}
