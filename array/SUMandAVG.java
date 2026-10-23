package array;
import java.util.*;
 class SUMandAVG {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter size of array : ");    
    int size = sc.nextInt();
    int[] arr = new int[size];
    for(int i =0; i<size; i++){
        arr[i] = sc.nextInt();
        System.out.println("enter a element of array : "+ arr[i]);
    }
    int sum = sum(arr);
    System.out.println("sum of array element : "+sum);

    double avg = average(arr);
    System.out.println("the average of array element : "+avg);
    
}
public static int sum(int[] myArr){
    int sum =0;
    for(int num : myArr){
        sum += num;//adds every element to sum
    }
    return sum;
}
public static double average(int[] myArr){
    if(myArr.length==0) return 0; // avoid division by zero
    int sum = sum(myArr);
    return (double) sum / myArr.length; //typecast to double for decimal accuracy
}
}
