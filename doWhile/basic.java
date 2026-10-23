package doWhile;
import java.util.*;
 class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // System.out.println("enter age : ");
        // int age = sc.nextInt();
        // while(age < 0 || age > 100){
        //     System.out.println("please enter your age : ");
        //     age = sc.nextInt();
        // }
        int age;
        do{
        System.out.println("enter age : ");
        age = sc.nextInt();
        } while(age < 0 || age > 100);

        System.out.println("your age is : "+age);
    }
}
