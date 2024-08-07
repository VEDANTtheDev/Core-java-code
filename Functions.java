import java.util.Scanner;

public class Functions{
   /* public static int printFactorial(int n){
        if (n<0){
            System.out.println("NUMBER IS INVALID");
            return -1;
        }

        int Fact = 1;
        for(int i = n; i>=1; i--){
            Fact=Fact*i;
        }
        return Fact;
    }*/

    public static void printFactorial(int n){
        if (n<0){
            System.out.println("NUMBER IS INVALID");
            return;
        }

        int Fact = 1;
        for(int i = n; i>=1; i--){
            Fact=Fact*i;
        }
        System.out.println("Factorial is : " + Fact);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();

        printFactorial(num);
    }
}
