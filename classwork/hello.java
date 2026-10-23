
import java.util.*;
public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i<size; i++){
            System.out.println("enter elements of array : ");
            arr[i] = sc.nextInt();
        }
        int result = searchInsertPosition(arr, size);
        System.out.println("your answer : " + result);
       
    }

    public static int searchInsertPosition(int[] num, int target){
        int size = num.length;
        for(int i = 0; i < size; i++){
            if(num[i] == target){
                return i;
            }
        }

        int q = size-1;
        while(q >= 0){
            if(target == 0 && num[0] > 0){
                return 0;
            }
            if(num[q] < target){
                return q+1;
            }
            else if(num[0] > target){
                return 0;
            }
            q--;
        }
        if(size == 1 && target < num[0]){
            return 0;
        }
        return -1;
    }
}
