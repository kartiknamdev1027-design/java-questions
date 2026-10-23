package loops;
import java.util.*;
public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = sc.nextInt();

        //2, 5, 8, 11, 14
        for(int i = 1 ; i<=3*n-1; i+=3){
            System.out.println(i+" ");
        }

    }
}
