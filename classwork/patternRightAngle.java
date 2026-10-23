
import java.util.*;
class patternRightAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = sc.nextInt();

        RigthAngleTriangle(num);

        reverse(num);
    }
    public static void RigthAngleTriangle(int num){
        for(int i = 1; i<=num; i++){ //row
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void reverse(int num){
        for(int i = 1; i<=num; i++){
            for(int j = num; j>=i; j--){
                System.out.print(j);
            }
        System.out.println();
        }
       
    }
}
