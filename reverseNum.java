



import java.util.*;

public class reverseNum {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter number for revese: ");
    int num = sc.nextInt();
    int rev = 0;
    while(num!=0){
        int temp = num%10;
        rev*=10;
        rev += temp;
        num/=10;
    }
    System.out.println(rev);
    sc.close();
}    
}
