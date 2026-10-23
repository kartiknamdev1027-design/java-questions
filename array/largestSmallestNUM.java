package array;
import java.util.*;
public class largestSmallestNUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter arrayy size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            System.out.println("enter array elements");
            arr[i] = sc.nextInt();
        }

        int max = largetsElement(arr);
        System.out.println("your largest element is : "+max);

        int min = smallestElement(arr);
        System.out.println("your smallest element is : " + min);

    }
    public static int largetsElement(int[] num){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<num.length; i++){
            if(num[i] > largest){
                largest = num[i];
            }
        }
        return largest;
    }

    public static int smallestElement(int[] num){
       int smallest = Integer.MAX_VALUE;
       for(int i = 0; i<num.length; i++){
        if(num[i] < smallest){
            smallest = num[i];
        }
       }
        return smallest;
    }
}
