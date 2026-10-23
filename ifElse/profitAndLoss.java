package ifElse;
import java.util.*;
public class profitAndLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //cost price
        System.out.print("enter cost price : ");
        int costPrice = sc.nextInt();

        //selling price
        System.out.print("enter selling price : ");
        int sellingPrice = sc.nextInt();

        if(costPrice > sellingPrice){
            System.out.println("loss " + (costPrice - sellingPrice));
        }else if(costPrice < sellingPrice){
            System.out.println("profit " +(sellingPrice - costPrice));
        }else if(costPrice == sellingPrice){
            System.out.println("no profit no loss");
        }


    }
}
