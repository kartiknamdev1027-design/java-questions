import java.util.*;
public class sumOfNum {
   public static void main(String[] args) {
    
   
    Scanner sc  = new Scanner (System.in);
    System.out.print("enter a number : ");
    int num = sc.nextInt();
 
int sum = 0;
while(num != 0){
    int lastDigit = num%10;
    sum += lastDigit;
    num /= 10;
}
System.out.println("the sum is = "+ sum);
}
}
