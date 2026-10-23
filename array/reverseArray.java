package array;
import java.util.*;
 class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i<size; i++){
            System.out.println("enter elements of array : ");
            arr[i] = sc.nextInt();
        }
       reverse(arr);
  System.out.print("here is your reverse array : ");
  for(int i = 0; i<arr.length; i++){
    System.out.print(arr[i] + " ");
  }
  }
  public static void reverse(int[] myNum){
    int left = 0;
    int right = myNum.length-1;
    while(left < right){
      int temp = myNum[left];
      myNum[left] = myNum[right];
      myNum[right] = temp;

      left++;
      right--;

    }
    }
}
