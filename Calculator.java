public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b != 0)
            return a / b;
        else {
            System.out.println("Error: Division by zero.");
            return Double.NaN;
        }
    }

    public static double sqrt(double a) {
        if (a >= 0)
            return Math.sqrt(a);
        else {
            System.out.println("Error: Cannot take square root of a negative number.");
            return Double.NaN;
        }
    }

    public static double power(double a, double b) {
        return Math.pow(a, b);
    }

    public static double mean(double[] numbers) {
        double sum = 0;
        for (double num : numbers)
            sum += num;
        return sum / numbers.length;
    }

    public static double variance(double[] numbers) {
        double mean = mean(numbers);
        double variance = 0;
        for (double num : numbers)
            variance += Math.pow(num - mean, 2);
        return variance / numbers.length;
    }
}
