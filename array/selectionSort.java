package array;
import java.util.*;
public class selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int[] num = new int[size];
        for(int i = 0; i<size; i++){
            System.out.println("enter elements of Array");
            num[i] = sc.nextInt();
        }
        for(int i = 0; i<size; i++){
            int min = i; 
            for(int j = i+1; j<size; j++){
                if(num[j] < num[min]){
                    min= j;
                }
            }
            int temp = num[i];
            num[i] = num[min];
            num[min]= temp;
        }
        System.out.println("sorted array"+ Arrays.toString(num));
    }
}
