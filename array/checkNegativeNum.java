package array;
import java.util.*;
public class checkNegativeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int size = sc.nextInt();

       int[] array = new int[size];
       
       System.out.println("enter array element");
       
       for(int i = 0; i<size; i++){
           array[i] = sc.nextInt();
        }

        
        System.out.print("negative numbers are :");
        //printing negative value
        for(int i = 0; i<size; i++){
           if(array[i]<0){
             System.out.println(array[i]+" ");
        }
    }
     sc.close();  
        
    }
}
