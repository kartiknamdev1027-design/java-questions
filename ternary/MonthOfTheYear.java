package ternary;
import java.util.*;

public class MonthOfTheYear {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter your month in a integer : ");
    int month = sc.nextInt();

    // switch(month){
    //     case 1 :
    //         System.out.println("January");
    //         break;
    //      case 2 :
    //         System.out.println("february");
    //         break;
    //      case 3 :
    //         System.out.println("march");
    //         break;
    //      case 4 :
    //         System.out.println("april");
    //         break;
    //     case 5 :
    //         System.out.println("may");
    //         break;
    //      case 6 :
    //         System.out.println("June");
    //         break;
    //      case 7 :
    //         System.out.println("July");
    //         break;
    //      case 8 :
    //         System.out.println("august");
    //         break;
    //      case 9 :
    //         System.out.println("september");
    //         break;
    //      case 10 :
    //         System.out.println("october");
    //         break;
    //      case 11 :
    //         System.out.println("november");
    //         break;
    //      case 12 :
    //         System.out.println("december");
    //         break;
    //     default:
    //         System.out.println("invalind month");
// }


String monthname = getMonthsName(month);
System.out.println("your month name is : "+monthname);


}
public static String getMonthsName(int monthNum){
    return switch (monthNum){
    case 1 -> "january";
    case 2 -> "february";
    case 3 -> "march";
   case 4 -> "april";
    case 5 -> "may";
    case 6 -> "june";
    case 7 -> "july";
    case 8 -> "august";
    case 9 -> "september";
    case 10 -> "october";
    case 11 -> "november";
    case 12 -> "december";
    default -> "invalid";
    };
}    
}
