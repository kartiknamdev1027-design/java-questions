
import java.util.*;
 class bipartible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];

        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();

        }
        int sum = 0;
        for(int x : a){
            sum+=x;
        }
        int left = 0;
        for(int x : a){
            left += x;
            if((sum -left) == left){
            System.out.println("bipartible");
        }
        }
        
    }
}
