//public class practice {
//    public static void printarray(int[] arr){
//        for(int i = 0;i<arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }
//    }
//    public static boolean isPalindrome(String string,int Start){
//        int n = string.length();
//        if(Start>=n/2) return true;
//        if(string.charAt(Start) != string.charAt(n-Start-1)) return false;
//        return isPalindrome(string,Start+1);
//    }
//    public static void main(String[] args) {
//        String str = "madam";
//        if (isPalindrome(str,0)){
//            System.out.println("Palindrome");
//        }else {
//            System.out.println("Not Palindrome");
//        }
//    }
//}

//Recursion Practice
public class practice {
    public static boolean strictIncrement(int arr[], int index){
        if (index == arr.length-1){
            return true;
        }
        if (arr[index]>=arr[index+1]){
            return false;
        }
        return strictIncrement(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,3};
        System.out.println(strictIncrement(arr,0));

    }
}