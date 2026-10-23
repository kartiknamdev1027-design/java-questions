package functions;
import java.util.*;
 class armstong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your armstrong number : ");
        int number = sc.nextInt();
        int originalNumber = number;
        int result = 0;

        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            result += remainder * remainder * remainder;
            originalNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
