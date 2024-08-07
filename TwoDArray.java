import java.util.Scanner;
/*

//Searching for an element x in a matrix.
public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr2d = new int[rows][cols];
        // Input
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.println("Enter " + rows*cols + " elements");
                System.out.println("Enter number: ");
                arr2d[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter number to find it's position: ");
        int x = sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
               if(arr2d[i][j] == x){
                   System.out.println("Position of " + x + " is: " + i + "," + j);
               }
            }
        }
    }
}
*/
// Printing transpose of a matrix!

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr2d = new int[rows][cols];
        // Input
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr2d[i][j] = sc.nextInt();
            }
        }
        //Output
        for(int j=0;j<cols;j++){
            for(int i=0;i<rows;i++){
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}