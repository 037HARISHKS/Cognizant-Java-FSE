import java.util.Scanner;

public class Qn1to5 {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        // Uncomment the method you want to run:
        // qn1_helloWorld();
        //qn2_simpleCalculator();
        // qn3_evenOrOddChecker();
        // qn4_leapYearChecker();
        // qn5_multiplicationTable();

        sc.close();
    }

    // Qn1: Hello World
    public static void qn1_helloWorld() {
        System.out.println("Hello, World!");
    }

    // Qn2: Simple Calculator
    public static void qn2_simpleCalculator() {
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Choose operation (+, -, *, /): ");
        char op = sc.next().charAt(0);
        double result;

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0)
                    result = num1 / num2;
                else {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation.");
                return;
        }

        System.out.println("Result: " + result);
    }

    // Qn3: Even or Odd Checker
    public static void qn3_evenOrOddChecker() {
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (num % 2 == 0)
            System.out.println(num + " is even.");
        else
            System.out.println(num + " is odd.");
    }

    // Qn4: Leap Year Checker
    public static void qn4_leapYearChecker() {
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }

    // Qn5: Multiplication Table
    public static void qn5_multiplicationTable() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Multiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
