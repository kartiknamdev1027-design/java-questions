package ternary;
import java.util.*;
public class studentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter students score : ");
        int score = sc.nextInt();
        String category = score > 80 ? "High" : (score > 50 ? "Moderate" : "Low");
        System.out.println("your score is : "+category);

    }
}
