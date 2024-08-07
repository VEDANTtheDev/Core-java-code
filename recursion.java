import java.util.*;

public class recursion {
    public static void main(String[] args) {
        /*int n = 1;
        printnum1(n);
        int a = 5;
        printnum(a);
        int b = 10;
        int ans = NaturalNumSum(b);
        System.out.println(ans);
        int c = 5;
        int res = factorial(c);
        System.out.println(res);
        int d = 10;
        System.out.println("Here is fibonacci sequence till " + d + "th term");
        printfibonacciSequence(d);*/
        int result = optimalPrintPower(10,5);
        System.out.println(result);
    }
    //Print numbers from 5 to 1.
    static void printnum(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        printnum(n-1);
    }
    //Print numbers from 1 to 5.
    static void printnum1(int n){//n=1
        if (n==6){
            return;
        }
        System.out.println(n);
        printnum1(n+1);
    }
    //Print sum of first n natural numbers.
    static int NaturalNumSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + NaturalNumSum(n - 1);
    }
    //Print factorial of a number n.
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        return n * factorial(n-1);
    }
    //Print fibonacci sequence till nth term.
    static int calcfibonaccinum(int n){
        if (n==0 || n==1){
            return n;
        }
        return calcfibonaccinum(n-1)+calcfibonaccinum(n-2);
    }
    static void printfibonacciSequence(int n){
        for(int i=0;i<n;i++){
            System.out.print(calcfibonaccinum(i) + " ");
        }
    }
    //Print x^n . with stack height = n
    static int printPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==1){
            return 1;
        }
        int pow = printPower(x,n-1);
        return x*pow;
    }
    // Print x^n with stack height logn.
    static int optimalPrintPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return optimalPrintPower(x,n/2)*optimalPrintPower(x,n/2);
        }
        else {
            return optimalPrintPower(x,n/2)*optimalPrintPower(x,n/2)*x;
        }
    }
}