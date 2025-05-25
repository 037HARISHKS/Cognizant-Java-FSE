import java.util.Scanner;

public class Qn11to15 {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        // Uncomment the method you want to run:
        // qn11_factorialCalculator();
        // qn12_methodOverloadingDemo();
        // qn13_recursiveFibonacci();
        // qn14_arraySumAverage();
        // qn15_reverseString();

        sc.close();
    }

    // Qn11: Factorial Calculator
    public static void qn11_factorialCalculator() {
        System.out.print("Enter a non-negative integer: ");
        int num = sc.nextInt();
        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
    }

    // Qn12: Method Overloading
    public static void qn12_methodOverloadingDemo() {
        System.out.println("Add(int, int): " + add(10, 20));
        System.out.println("Add(double, double): " + add(3.5, 4.5));
        System.out.println("Add(int, int, int): " + add(5, 10, 15));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Qn13: Recursive Fibonacci
    public static void qn13_recursiveFibonacci() {
        System.out.print("Enter a positive integer n: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Qn14: Array Sum and Average
    public static void qn14_arraySumAverage() {
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double average = (double) sum / n;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }

    // Qn15: String Reversal
    public static void qn15_reverseString() {
        sc.nextLine(); // Consume leftover newline
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        StringBuilder reversed = new StringBuilder(input).reverse();
        System.out.println("Reversed String: " + reversed.toString());
    }
}
