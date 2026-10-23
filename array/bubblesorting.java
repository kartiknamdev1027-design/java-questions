package array;

import java.util.*;
public class bubblesorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int[] num = new int[size];
        for(int i = 0; i<size; i++){
            System.out.print("enter elements of array");
            num[i] = sc.nextInt();
        } 
        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num.length-1; j++){
                if(num[i] < num[j]){
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        for(int i = 0; i<num.length; i++){
            System.out.print(num[i] + " ");
        }
    }
}


