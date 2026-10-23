import java.util.*;
public class AreaOfTriangle {
    public static void main(String[] args) {
        //1/2 *B*H

        Scanner sc = new Scanner(System.in);
        System.out.print("please enter height: ");
        float height = sc.nextFloat(); 
        System.out.print("please enter Base: ");
        float base = sc.nextFloat();

        float AreaOfTriangle = (base * height)/2;
        System.out.print("Area of triangle is : "+AreaOfTriangle);
        
    }
    
}
