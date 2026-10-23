import java.util.*;
public class lcmOfNum {
         public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    // Function to calculate LCM using the GCD formula
    public static int findLCM(int a, int b) {
        if (a == 0 || b == 0) {
            return 0; // LCM with zero is always zero
        }
        // Division is performed first to prevent potential integer overflow
        return (a / findGCD(a, b)) * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Calculate results
        int gcd = findGCD(num1, num2);
        int lcm = findLCM(num1, num2);

        // Display results
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

        scanner.close();
    }
}
