package array;
import java.util.*;
public class secondLargest {
    //linear element in the array

    
    public static void main(String [] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter size of Array : "); 
     int size = sc.nextInt();

     int[] arr = new int[size];
      // input
     for(int i = 0; i<size; i++){
        System.out.print("enter your elements : ");
      arr[i] = sc.nextInt();
     }
    //output
     int result = SecondLargest(arr);
     System.out.println("second largest number is : "+result);
    
    }

    public static int SecondLargest(int[] num){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int nums : num){
            if(nums > first){
                second = first;
                first = nums;
            }else if(nums > second && nums < first){
                second = nums;
            }
        }        
        return second;
        }
    }

