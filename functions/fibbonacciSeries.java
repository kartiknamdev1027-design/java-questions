package functions;
import java.util.*;

 class fibbonacciSeries {


    // fibbonacci number = 0+1=1+1=2+1=3+2=5+3=8+5=13
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number : ");
    int num = sc.nextInt();
    printFibbonacci(num);
}

public static void printFibbonacci(int num){
       
    if (num < 0) return;
    if (num == 0) System.out.println("0");
    int first = 0;
    int second = 1;
    while(first + second <= num){
        int third = first+ second;
        System.out.println(third + " ");
        first = second;
        second = third;
    } 

}
 }
