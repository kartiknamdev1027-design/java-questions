package pattern;
import java.util.*;
public class patterns2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
/*
*****
****
***
**
*
*/
        System.out.print("enter number of stars do you want : ");
        int num = sc.nextInt();
        for(int i = 0; i<=num; i++){//row
            for(int j = 1+i; j<=num; j++){//column
                System.out.print(" * ");
            }
          System.out.println();
        }



    }
}
