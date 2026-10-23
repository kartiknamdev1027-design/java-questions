import java.util.*;
public class switchbasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter number : ");
        int days = sc.nextInt();

        switch(days){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("satday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default :
                System.out.println("invalid");
                break;
        }
    }
}
