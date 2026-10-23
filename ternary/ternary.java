package ternary;

import java.util.*;
public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1 : ");
       int num = sc.nextInt();
        System.out.println("enter number 2 : ");
        int num2 = sc.nextInt();
        //variable = expresion1 ? expression2 : expression3
        int greater = num > num2 ? num : num2;
        System.out.println(greater + " is the greatest number");
       
    }
    
}
