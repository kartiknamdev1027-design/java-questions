package array;
import java.util.*;
 class NoOfOccurances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            System.out.print("enter your number : ");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("enter element to check occurance : ");
        int num = sc.nextInt();

        int occ = NoOfOccurances(arr, num);
        System.out.println(num + " occur " + occ + " times in the array ");        

    }
    
    public static int NoOfOccurances(int[] numArr, int num){
        int occ = 0;
        int i = 0;
        while(i < numArr.length){
            if(numArr[i] == num){
                occ++;
            }
            i++;
        }
    
        return occ;
    }
}

