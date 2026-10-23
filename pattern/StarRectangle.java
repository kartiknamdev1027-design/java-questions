package pattern;


    import java.util.*;
public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*  *****
            *****
            ***** */
           System.out.println("enter numbers of rows");
        int n = sc.nextInt();
        System.out.println("enter number of coulumns");
        int m = sc.nextInt();

        for(int i = 1; i<=n; i++){   //no.of rows
            for(int j = 1; j<=m; j++){ //no. of coulumns
                System.out.print("* ");
            }
        System.out.println(); //enter 
        }

        /*  ***
            ***
            ***  square box */
            System.out.println("enter number for square box ");
            int o = sc.nextInt();
            for(int i = 1; i<=o; i++){
                for(int j = 1; j<=o; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
               
    }
}
 