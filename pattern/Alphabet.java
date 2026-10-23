package pattern;
import java.util.*;
public class Alphabet {
    public static void main(String[] args) {
       /*for A B C D
             A B C D
             A B C D
             A B C D  */
       
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row and column");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=m; j++){
                System.out.print((char)(i+96)+" ");   //us etype casting
            }
            System.out.println();
        }


        /* FOR AAA
               BBB
               CCC  change in sout by ((char)(i+96)+" ") */
    }
}
