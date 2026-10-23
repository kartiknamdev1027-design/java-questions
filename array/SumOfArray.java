package array;
import java.util.*;
public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the elements of the array");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
            System.out.println(arr[i] + " ");
}
int sum = 0; 
    for(int i = 0; i<arr.length; i++){
sum += arr[i];
    }
System.out.println("the sum is : "+ sum);
    }
}


