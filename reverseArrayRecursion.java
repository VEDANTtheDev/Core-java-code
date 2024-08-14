// Reversing an array using recursion with a single pointer.

public class reverseArrayRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse(arr,0);
        System.out.println("\nReversed Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void reverse(int[] arr, int start){
        int n = arr.length;
        if (start>=n/2){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[n-start-1];
        arr[n-start-1] = temp;

        reverse(arr,start+1);
    }

}