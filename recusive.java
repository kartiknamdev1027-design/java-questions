
import java.util.*;
public class recusive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to factorial");
        System.out.println("enter number : ");
        int num = sc.nextInt();

        long fact = factorialIterativ(num);
        System.out.println("factorial is: " + fact);

    }
    public static long factorialIterativ(int num){
        int result = 1; 
        for(int i = 1; i<=num; i++){
            result *= i;
        }
        return result;
    }
    public static long factorialRecusive(int num){  //self calling funtion is called recursion
        if(num == 1){
            return 1;
        }
        return num * factorialRecusive(num - 1);
    }
}
