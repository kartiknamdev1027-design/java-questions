package ternary;

import java.util.*;
 class minimumOfTwoNum {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number one : ");
    int oneNum = sc.nextInt();
    System.out.println("enter number two : ");
    int twoNum = sc.nextInt();
    int minimum = oneNum < twoNum ? oneNum : twoNum;
    System.out.println("your minimum number is : "+minimum);
}    
}
