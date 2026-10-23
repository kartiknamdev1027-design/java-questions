package ifElse;

import java.util.*;
public class evenOdd{
  public static void main(String[] args) {
    /*for input */
    Scanner sc = new Scanner(System.in);
    //print
    System.out.println("enter a number: ");
    int n = sc.nextInt(); //input number

    if(n % 2 == 0){    
      System.out.println("This number is even : ");
    }else{
      System.out.println("This number is odd : ");
    }
  }
}
