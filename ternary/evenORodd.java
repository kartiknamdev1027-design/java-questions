package ternary;
import java.util.*;
public class evenORodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check even or odd : ");
        int num = sc.nextInt();

       String result = num % 2 == 0 ? "even":"odd"; 
        System.out.println("this number is "+result);
    
        
    }
    
}
