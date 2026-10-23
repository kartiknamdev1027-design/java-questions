package loops;
import java.util.*;
public class GP {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("enter a number : ");
    int n = sc.nextInt();
    //G.P is 1, 2, 4, 8, 16
    int a = 1;
    int r = 2;
    for(int i = 1; i<=n; i++){
        System.out.println(a);
        a *= r;
    }

}
}
