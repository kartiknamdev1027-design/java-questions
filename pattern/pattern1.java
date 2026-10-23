package pattern;
import java.util.*;
public class pattern1 {
    

    /*
*
* *
* * *
* * * *
* * * * *
    */
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number of rows");
        int rows = sc.nextInt();
        printFirstPattern(rows);

    }

    public static void printFirstPattern(int Maxrows){
        int rows = 0;
        while(rows < Maxrows){
            System.out.print("*");
            int i = 0;
            while(i < rows){
                System.out.print(" *");
            i++;
            }
            System.out.println();
            rows++;
        }
    }
}
