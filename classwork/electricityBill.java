
import java.util.*;
 class electricityBill {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter units :");
        int Units = sc.nextInt();  //per unit

        double bill = calculateBill(Units);
        System.out.printf("%.2f%n", bill);
        
        // agar 100 units he to 1.50 rs
       sc.close();
    }

    public static double calculateBill(int units){
        double bill = 0.0;

        if(units <= 100){
            bill = units * 1.50;
        }else if(units <= 200){
            bill = 100 * 1.50 + (units - 100) * 2.50;
        }else if(units <= 300){
            bill = 100 * 1.50 + 100 * 2.50 + (units - 200) * 4.00;
        }else {
            bill = 100 * 1.50 + 100 * 2.50 + 100 * 4.00 + (units - 300) * 6.00;
        }
        return bill;
    }
}
