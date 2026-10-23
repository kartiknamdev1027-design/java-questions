
import java.util.*;
public class perimeterOfRectangle {
    public static void main(String[] args) {
        //formula used in ABCD = A+B+C+D
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of A : ");
        int A = sc.nextInt();
        System.out.print("Enter a number of B : ");
        int B = sc.nextInt();
        System.out.print("Enter a number of C : ");
        int C = sc.nextInt();
        System.out.print("Enter a number of D: ");

         int D = sc.nextInt();
         int Perimeter = A+B+C+D;
         System.out.print("the perimeter of rectangle is : "+ Perimeter);
    }

}
