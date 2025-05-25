import java.util.Scanner;

public class Qn26to30 {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        // Uncomment the method you want to run:
        // qn26_multiplyMatrix();
        // qn27_palindromeNumber();
        // qn28_printPrimeInRange();
        // qn29_sumOfDigits();
        // qn30_swapWithoutTemp();

        sc.close();
    }

    // Qn26: Multiply Two Matrices
    public static void qn26_multiplyMatrix() {
        System.out.print("Enter rows and columns of matrix A: ");
        int r1 = sc.nextInt(), c1 = sc.nextInt();
        System.out.print("Enter rows and columns of matrix B: ");
        int r2 = sc.nextInt(), c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Multiplication not possible.");
            return;
        }

        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];
        int[][] C = new int[r1][c2];

        System.out.println("Enter matrix A:");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter matrix B:");
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                B[i][j] = sc.nextInt();

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Product Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Qn27: Palindrome Number Check
    public static void qn27_palindromeNumber() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num, rev = 0;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        if (original == rev)
            System.out.println("Palindrome number.");
        else
            System.out.println("Not a palindrome.");
    }

    // Qn28: Print Prime Numbers in Range
    public static void qn28_printPrimeInRange() {
        System.out.print("Enter range (start end): ");
        int start = sc.nextInt(), end = sc.nextInt();

        System.out.println("Prime numbers:");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
        System.out.println();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    // Qn29: Sum of Digits
    public static void qn29_sumOfDigits() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt(), sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("Sum of digits: " + sum);
    }

    // Qn30: Swap Two Numbers Without Temp
    public static void qn30_swapWithoutTemp() {
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
