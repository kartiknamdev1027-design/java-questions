import java.util.Scanner;

public class SumOfLastDigit {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter first number : ");
    int a = sc.nextInt();
    System.out.println("enter second number : ");
    int b = sc.nextInt();
    int lastDigita = Math.abs(a % 10);
    int lastDigitb = Math.abs(b % 10);
    int sum = lastDigita + lastDigitb;
    System.out.println(sum);
    sc.close();
    }
}
