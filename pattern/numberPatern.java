package pattern;
import java.util.*;
public class numberPatern {
    public static void main(String[] args) {
        /* 1234
           1234
           1234
           1234 */
        
        
        Scanner sc = new Scanner(System.in);
        
       System.out.println("enter the number of row and coulumn");
       int n = sc.nextInt();
       int m = sc.nextInt();
       for(int i = 1; i<=n; i++){ //rows
        for(int j = 1; j<=m; j++){  //coulumn
            System.out.print(j);
        }
        System.out.println();
       }
    }
}
