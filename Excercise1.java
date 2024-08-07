//Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;
/*public class Excercise1{
    public static void calAverage(int num1,int num2,int num3){
        int Average = (num1+num2+num3)/3;
        System.out.println("Average is: " + Average);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter your number 2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter your number 3: ");
        int num3 = sc.nextInt();

        calAverage(num1,num2,num3);
    }
}*/

//Write a function to print the sum of all odd numbers from 1 to n.
/*public class Excercise1{
    public static void sumOfOddNum(int num){
        int sum = 0;
        for(int i=1;i<=num;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println("Sum of odd number from 1 to n is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();

        sumOfOddNum(num);
    }
}*/

//Write a function which takes in 2 numbers and returns the greater of those two.

/*public class Excercise1{
    public static void compareNum(int num1,int num2){
        if (num1<num2){
            System.out.println(num1 + " is greater than " + num2);
        } else if (num2<num1) {
            System.out.println(num1 + " is greater than " + num2);
        }
        else {
            System.out.println("Both numbers are equal!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter your number 2: ");
        int num2 = sc.nextInt();

        compareNum(num1,num2);
    }
}*/
//Write a function that takes in the radius as input and returns the circumference of a circle.
/*public class Excercise1{
    public static void circleCircumference(int r){
        double Perimeter = 2*3.14*r;
        System.out.println("Perimeter is " + Perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your radius: ");
        int r = sc.nextInt();

        circleCircumference(r);
    }
}*/


//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
//Write an infinite loop using do while condition.
/*public class Excercise1{
    public static void main(String[] args) {
        do {
            System.out.println("Java");
        }while (true);

    }
}*/

//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
public class Excercise1{
    public static void main(String[] args) {
        int positive = 0, negative = 0, zeroes = 0;
        System.out.println("Press 1 to continue & 0 to exit");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        while (input == 1){
            System.out.println("Enter number : ");
            int number = sc.nextInt();
            if(number>0){
                positive++;
            } else if (number<0) {
                negative++;
            }else {
                zeroes++;
            }
            System.out.println("Press 1 to continue & 0 to stop");
            input = sc.nextInt();
        }
        System.out.println("Positives : "+ positive);

        System.out.println("Negatives : "+ negative);

        System.out.println("Zeros : "+ zeroes);
    }
}
//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
