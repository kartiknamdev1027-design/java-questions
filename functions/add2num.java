package functions;
import java.util.*;
public class add2num {
 
    public static int addNum(int a, int b){
    int sum = a + b;
    return sum;
    }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter numbere a : ");
            int a = sc.nextInt();
            System.out.println("enter number b : ");
            int b = sc.nextInt();
            int sum = addNum(a, b);
        System.out.println("the sum is : "+sum);
        }
    
}
