package doWhile;
import java.util.*;
 class passwordCheaker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password;
        do{
            System.out.println("please enter your password");
             password = sc.next();
        }while(!validPassword(password));
        System.out.println("thanks for entering password");
      
    }

    public static boolean validPassword(String pass){
        return pass.length() > 5;
    }
}
