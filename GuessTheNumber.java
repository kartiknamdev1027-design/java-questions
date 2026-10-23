import java.util.*;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 5, guess;

        
        do{
         
           System.out.println("please enter guess number : ");
            guess = sc.nextInt();
        } while(num != guess);
            System.out.println("you have succesfully guess the number : "+ num);
        
    }
}
