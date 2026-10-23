package ternary;
import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number one");
        int num1 = sc.nextInt();
        System.out.println("enter operation to perform : ");
        String operation = sc.next();
        System.out.println("enter number 2 : ");
        int num2 = sc.nextInt();
        

        int result = switch (operation){
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "/" -> num1 / num2;
            case "*" -> num1 * num2;
            default -> -1;
        };
        System.out.println("your answer is : "+result);
    }


}
