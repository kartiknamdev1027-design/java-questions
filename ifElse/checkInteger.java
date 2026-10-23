package ifElse;
import java.util.*;
public class checkInteger {
    public static void main(String[] args) {
        //we check the number is integer or decimal
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check the number is integer or not : ");
        double num = sc.nextDouble();
        int x = (int)num;
        if(num - x > 0){
            System.out.println("not an Integer");
        }else{
            System.out.println("it is integer");
        }
    }
}
