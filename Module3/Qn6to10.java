import java.util.Scanner;

public class Qn6to10 {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        // Uncomment the method you want to run:
        // qn6_palindromeChecker();
        // qn7_largestOfThree();
        // qn8_simpleInterestCalculator();
        // qn9_numberSwap();
        // qn10_asciiValue();

        sc.close();
    }

    // Qn6: Palindrome Checker
    public static void qn6_palindromeChecker() {
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equals(reversed))
            System.out.println(str + " is a palindrome.");
        else
            System.out.println(str + " is not a palindrome.");
    }

    // Qn7: Largest of Three Numbers
    public static void qn7_largestOfThree() {
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest = a;

        if (b > largest)
            largest = b;
        if (c > largest)
            largest = c;

        System.out.println("Largest number is: " + largest);
    }

    // Qn8: Simple Interest Calculator
    public static void qn8_simpleInterestCalculator() {
        System.out.print("Enter principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter rate: ");
        double r = sc.nextDouble();
        System.out.print("Enter time: ");
        double t = sc.nextDouble();

        double si = (p * r * t) / 100;
        System.out.println("Simple Interest: " + si);
    }

    // Qn9: Swap Two Numbers
    public static void qn9_numberSwap() {
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Before swap: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: a = " + a + ", b = " + b);
    }

    // Qn10: ASCII Value of Character
    public static void qn10_asciiValue() {
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        int ascii = (int) ch;

        System.out.println("ASCII value of '" + ch + "' is: " + ascii);
    }
}
