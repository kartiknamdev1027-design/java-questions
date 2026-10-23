
import java.util.*;
public class sumOfevenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num : ");
        int num = sc.nextInt();
        int sum = 0;
        while(num != 0){
            int temp = num%10;
            if(temp %2==0){
                sum += temp;
               
            }
             num/=10;
        }
        System.out.println("the answer is = " + sum);
    }
}
