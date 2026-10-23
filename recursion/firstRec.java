package recursion;
import java.util.*;
public class firstRec {

    public static void printNUm(int n){
        if(n==0) return;
        
        
        System.out.println(n);
        printNUm(n-1);
    }
    public static void main(String[] args) {
       int n = 5;
       printNUm(n);


   } 
   

}
