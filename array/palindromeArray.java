package array;
import java.util.*;

 class palindromeArray {
     public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
    System.out.println("enter a number of array : ");
    int size = sc.nextInt();
    int[] arr = new int[size];
   for(int i = 0; i<size; i++){
    System.out.print("enter array element : ");
     arr[i] = sc.nextInt();
  }
boolean palindrome = isPalindrome(arr);
 if(isPalindrome(arr)){
    System.out.println("your number is palindrome ");
 }else{
    System.out.println("your number is not palindrome");
 }
  
  }
  public static boolean isPalindrome(int[] num){
    int left = 0;
    int right = num.length-1;
    while(left < right){
        if(num[left] != num[right]){
            return false;
        }
        left++;
        right--;
    }
    return true;
  }
}
