import java.util.Scanner;

public class Qn36to41 {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        // Uncomment the method you want to run:
        // qn36_checkPrime();
        // qn37_reverseNumber();
        // qn38_countWords();
        // qn39_findMaxInArray();
        // qn40_calculatePower();
        // qn41_simpleCalculator();

        sc.close();
    }

    // Qn36: Check if Number is Prime
    public static void qn36_checkPrime() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(num + (isPrime ? " is a prime number." : " is not a prime number."));
    }

    // Qn37: Reverse a Number
    public static void qn37_reverseNumber() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reversed = 0;

        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }

        System.out.println("Reversed number: " + reversed);
    }

    // Qn38: Count Words in a String
    public static void qn38_countWords() {
        System.out.print("Enter a sentence: ");
        sc.nextLine(); // Clear buffer
        String input = sc.nextLine();
        String[] words = input.trim().split("\\s+");
        System.out.println("Number of words: " + words.length);
    }

    // Qn39: Find Maximum in Array
    public static void qn39_findMaxInArray() {
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum element: " + max);
    }

    // Qn40: Calculate Power of a Number
    public static void qn40_calculatePower() {
        System.out.print("Enter base and exponent: ");
        double base = sc.nextDouble();
        int exponent = sc.nextInt();

        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power " + exponent + " is: " + result);
    }

    // Qn41: Simple Calculator
    public static void qn41_simpleCalculator() {
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        double result = 0;
        boolean valid = true;

        switch (op) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': 
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero!");
                    valid = false;
                }
                break;
            default: 
                System.out.println("Invalid operator!");
                valid = false;
        }

        if (valid) {
            System.out.println("Result: " + result);
        }
    }
}
