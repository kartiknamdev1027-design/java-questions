package array;
import java.util.*;
public class insertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sise of array");
        int size = sc.nextInt();
        int[] num = new int[size];
        for(int i = 0; i<size; i++){
            System.out.println("enter elements ");
            num[i] = sc.nextInt();
        }
       


        for(int i = 0; i<num.length; i++){
            int key = num[i];
            int j = i - 1;
            while(j >=0 && num[j] > key){
                num[j + 1] = num[j];
                j = j - 1;
            }
            num[j + 1] = key;
        }
        System.out.println("Sorted array : " );
        for(int val:num){
            System.out.println(val + " ");
        }
        System.out.println();
    }
}
