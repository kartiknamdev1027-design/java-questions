package ifElse;
import java.util.*;
public class divisibleNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //inppt
         System.out.print("enter a number to check divisible by 5 : ");

        int num = sc.nextInt();
       
        if (num % 5 == 0 && num >= 0){   //if number is positive and divisible by 5
            System.out.println("this number is divisible by 5 and the answer is : " + num / 5);
        }
        else{
            System.out.println("this num is not divisible by 5");
        }
    }
}
