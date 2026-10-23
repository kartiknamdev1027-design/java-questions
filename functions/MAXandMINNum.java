package functions;

import java.util.Scanner;

public class MAXandMINNum {
    
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
    System.out.println("enter a number of array : ");
    int size = sc.nextInt();
    int[] arr = new int[size];
   for(int i = 0; i<size; i++){
    System.out.print("enter array element : ");
     arr[i] = sc.nextInt();
  }


   int maximum = maximum(arr);
   System.out.println("here is your maximum number in Array : "+maximum);
  
   int mini = minimum(arr);
   System.out.println("here is your minimum value of array : "+mini);
  }
  
   
//minimum value 
    public static int minimum(int[] MyNum){
      int min = Integer.MAX_VALUE;
      int i = 1;
      while(i < MyNum.length){
        if(min > MyNum[i]){
          min = MyNum[i];
        }
        i++;
      }
      return min;
    }
//maximum value
    public static int maximum(int[] myNum){
     if(myNum.length == 0){
      return Integer.MIN_VALUE;
     }
     int max = myNum[0];
     int i = 1;
     while(i < myNum.length){
      if(max < myNum[i]){
        max = myNum[i];
      }
      i++;
     }
     return max;
    }
  }

