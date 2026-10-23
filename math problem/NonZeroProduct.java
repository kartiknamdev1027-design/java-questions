import java.util.*;
public class NonZeroProduct {
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int product = 1;
        while(num != 0){
            int temp = num% 10;
            if(temp != 0){
                product *= temp;
            }
            num/=10;
        }
        System.out.println("product is = "+ product);
    }
}
