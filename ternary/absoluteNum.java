package ternary;
import java.util.*;
public class absoluteNum {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check : ");
        int num = sc.nextInt();

        int absolute = num >= 0 ? num : -num;
       System.out.println(absolute);
    }
}
