package functions;
import java.util.*;

 class palindrome {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // example = 123321 is a pallindrome becouse we read a number from left side and we read a number from right side both sides are equal for reading
    System.out.println("enter a number : ");
    String num = sc.nextLine();
        if(isPalindrome(num)){
            System.out.println(num + "is a pallindrome");
        }else{
            System.out.println(num + "is not pallindrome");
        }
    

    }
   
    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    }

