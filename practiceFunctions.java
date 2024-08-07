import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class practiceFunctions {
    //Brute Force

    /*public static void checkPrimeNum(int num){
        if (num<2){
            System.out.println("It is not a prime number! ");
            return;
        }
        int count = 0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count+=1;
            }
        }
        if (count>2){
            System.out.println("Number " + num + " is not a prime number! ");
        }else {
            System.out.println("Number " + num + " is a prime number! ");
        }
    }*/

    //Optimized approach

    /*public static void checkPrimeNum(int num){
        boolean isprime = true;
        if(num<2){
            System.out.println("Not a prime number.");
        }
        else {
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    isprime = false;
                    break;
                }
            }
        }
        String result = isprime ? "Prime" : "Not Prime";
        System.out.println("The number " +num+ " is: " + result);
    }*/

    //Checking if a given number n is even or odd

    //Brute force

    /*public static void checkEvenOdd(int num){
        if(num<=0){
            System.out.println("INVALID NUMBER");
        }
        else{
            if(num%2==0){
                System.out.println("Even Number");
            }else {
                System.out.println("Odd Number");
            }
        }
    }*/

    // Using ternary operator

    /*public static void checkEvenOdd(int num){
        String result = num%2 == 0 ? " is even" : " is Odd";
        System.out.println(num + result);
    }*/

    //Printing a table of a given number n

    public static void printTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();

        //checkPrimeNum(num);
        //checkEvenOdd(num);
        printTable(num);
    }
}