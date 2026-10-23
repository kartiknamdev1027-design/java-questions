package array;

import java.util.*;

public class linearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            System.out.print("enter array element ");
            arr[i] = sc.nextInt();
        }
        System.out.println("enter target for search : ");
       int target = sc.nextInt();


       boolean result = linearSearch(arr, target);
       System.out.println(result);
    }
    public static boolean linearSearch(int[] num, int target){
    
        for(int i = 0; i<num.length; i++){
            if(num[i] == target){
                return true;
            
            }
            
        }
        return false;
    }

}
