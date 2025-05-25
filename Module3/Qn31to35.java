import java.util.Scanner;

public class Qn31to35 {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        // Uncomment the method you want to run:
        // qn31_findGCD();
        // qn32_decimalToBinary();
        // qn33_removeVowels();
        // qn34_sumOfArrayElements();
        // qn35_generatePattern();

        sc.close();
    }

    // Qn31: Find GCD of Two Numbers
    public static void qn31_findGCD() {
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD is: " + a);
    }

    // Qn32: Decimal to Binary Conversion
    public static void qn32_decimalToBinary() {
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();
        String binary = Integer.toBinaryString(num);
        System.out.println("Binary: " + binary);
    }

    // Qn33: Remove Vowels from String
    public static void qn33_removeVowels() {
        System.out.print("Enter a string: ");
        sc.nextLine();  // Clear buffer
        String input = sc.nextLine();
        String result = input.replaceAll("[AEIOUaeiou]", "");
        System.out.println("String without vowels: " + result);
    }

    // Qn34: Sum of Array Elements
    public static void qn34_sumOfArrayElements() {
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("Sum: " + sum);
    }

    // Qn35: Generate Pattern
    public static void qn35_generatePattern() {
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
