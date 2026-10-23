package array;

import java.util.Scanner;

public class findX {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number to take array : ");
      int size = sc.nextInt();
     
      int[] arr = new int[size];
      System.out.println("enter elements of array : ");
      for(int i = 0; i<size; i++){
        arr[i] = sc.nextInt();
      }
      System.out.println("enter he value of x for search");
      int x = sc.nextInt();


      for(int i = 0; i<arr.length; i++){
      if(arr[i] == x){
        System.out.println("x is found in the position : "+i);
      }
      }
      
    }
    
}
