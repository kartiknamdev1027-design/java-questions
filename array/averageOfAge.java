package array;
import java.util.*;
public class averageOfAge {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter size");
    int size = sc.nextInt();
  
    int[] ages = new int[size];

    for(int i = 0; i<ages.length; i++){
       
        ages[i] = sc.nextInt();
         System.out.println("enter age ");
    }
    float avg, sum = 0;
    int length = ages.length;
    for(int age : ages){
        sum+=age;
    }
    avg = sum/length;
    System.out.println("the avg age is " + avg);
}
 
}
