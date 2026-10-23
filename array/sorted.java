package array;
import java.util.*;
 class sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            System.out.print("enter elements of array : ");
            arr[i] = sc.nextInt();
        }
        boolean isIncreasing = isIncreasing(arr);
        boolean isDecreasing = isDecreasing(arr);
        if(isIncreasing || isDecreasing){
            System.out.println("your array is sorted array");
        }else{
           System.out.println("your array is not sorted"); 
        }
    }

    public static boolean isIncreasing(int[] numArr){
        int i = 1;
        while(i < numArr.length){
        if(numArr[i] < numArr[i-1]){
            return false;
        }
        i++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] numArr){
         int i = 1;
        while(i < numArr.length){
        if(numArr[i] > numArr[i-1]){
            return false;
        }
        i++;
        }
        return true;
    }
}
