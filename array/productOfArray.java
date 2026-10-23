package array;

public class productOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 45, 6, 7, 8, 9};
        int sum = 1;
        for(int i = 0; i<arr.length; i++){
            sum = sum * arr[i];
        }
        System.out.println(sum);
    }
}
