import javax.swing.*;
import java.util.Scanner;
public class Factorial_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int n = sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.println(printFactorial(i));
        }*/
        /*int n = sc.nextInt();
        int k = sc.nextInt();
        table(n,k);*/
        int num =sc.nextInt();
        int ans = snnas(num);
        System.out.println(ans);
    }
    static int printFactorial(int n){
        if(n==0||n==1){
            return n;
        }
        return printFactorial(n-1) + printFactorial(n-2);
    }
    static void table(int num, int k){
        if (k==1){
            System.out.println(num*k);
            return;
        }
        table(num,k-1);
        System.out.println(num*k);
    }
    static int snnas(int n){
        if(n==0){
            return 0;
        }
        if (n%2==0){
            return snnas(n-1) - n;
        }else{
            return snnas(n-1) + n;
        }
    }
}