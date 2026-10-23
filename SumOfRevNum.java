

import java.util.*;
public class SumOfRevNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("enter a number : ");
    int num = sc.nextInt();  //input if 12345
    int rev = 0;
    while(num != 0){
        int temp = num%10;
        rev *= 10;
        rev+=temp;
        num /= 10;
    }
    System.out.println("the reverse number is : "+rev);

    int sum = 0;
    while(rev != 0){
        int digit = rev%10;
        sum += digit;
        rev /=10;

    }  
    System.out.println("the sum is : "+sum);
 }
}
    

