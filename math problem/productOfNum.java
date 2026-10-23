
import java.util.*;
public class productOfNum {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int num = sc.nextInt();
        int product = 1;
        while(num != 0){
            int lastDigit = num%10;
            product *= lastDigit;
            num/=10;

        }
        System.out.println("the product is = " + product);
    }
    }

