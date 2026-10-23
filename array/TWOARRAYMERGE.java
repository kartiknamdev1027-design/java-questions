package array;
//array all questions

import java.util.*;
 class TWOARRAYMERGE {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
    System.out.println("enter a number of array : ");
    int size = sc.nextInt();
    int[] arr1 = new int[size];
   for(int i = 0; i<size; i++){
    System.out.print("enter first array element : ");
     arr1[i] = sc.nextInt();
  }
   int[] arr2 = new int[size];
   for(int i = 0; i<size; i++){
    System.out.print("enter second array elements : ");
    arr2[i] = sc.nextInt();
   }

   int[] mergedArr = merger(arr1, arr2);
   System.out.print("your merger array is : ");
   for(int i = 0; i<mergedArr.length; i++){
    System.out.print(mergedArr[i] + " ");
   }
    }
    public static int[] merger(int[] arr1, int[] arr2){
      int newSize = arr1.length + arr2.length;
      int[] newArr = new int[newSize];

      int i = 0, j = 0, k = 0;
      while(i < arr1.length || j < arr2.length){
        if(j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])){
          newArr[k] = arr1[i];
          i++;
          k++;
        }else{
          newArr[k] = arr2[j];
          k++;
          j++;

        }
      }
      return newArr;
    }

  }

