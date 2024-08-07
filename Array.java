import java.util.Scanner;

//Take an array of names as input from the user and print them on the screen.

/*public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of names to enter: ");
        int count= sc.nextInt();
        String[] name = new String[count];

        for(int i = 0;i<count;i++){
            System.out.println("Enter name : ");
            name[i] = sc.next();
        }
        for (int i =0;i<count;i++){
            System.out.println(" Name " + (i+1) + " is " + name[i]);
        }
    }
}*/
//Find the maximum & minimum number in an array of integers.

/*
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total count of numbers : ");
        int count= sc.nextInt();
        int[] numbers = new int[count];

        //input
        for(int i = 0;i<count;i++){
            System.out.println("Enter number : ");
            numbers[i] = sc.nextInt();
        }
        //output
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<count;i++){
            if(numbers[i]<min){
                min = numbers[i];
            }
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        System.out.println("Minimum number is: " + min);
        System.out.println("Maximum number is: " + max);
    }
}*/

//Take an array of numbers as input and check if it is an array sorted in ascending order.
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total count of numbers : ");
        int count= sc.nextInt();
        int[] numbers = new int[count];

        //input
        for(int i = 0;i<count;i++){
            System.out.println("Enter number : ");
            numbers[i] = sc.nextInt();
        }
        //output
        boolean isAscending = true;

        for (int i=0;i<numbers.length-1;i++){
            if(numbers[i]>numbers[i+1]){
                isAscending=false;
            }
        }
        if(isAscending){
            System.out.println("Array is in a ascending order.");
        } else {
            System.out.println("Array is not in ascending order.");
        }
    }
}