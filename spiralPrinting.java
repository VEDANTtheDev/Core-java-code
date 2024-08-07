//Print the spiral order matrix as output for a given matrix of numbers. [Difficult for Beginners]

import java.util.Scanner;

public class spiralPrinting {
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
                arr2d[i][j] = sc.nextInt();
            }
        }
        //output
        System.out.println("Spiral order of given matrix is: ");
        int rowstart = 0;
        int rowend = rows-1;
        int colstart = 0;
        int colend = cols-1;
        while(rowstart<=rowend && colstart<=colend){
            //1
            for(int col=colstart;col<=colend;col++){
                System.out.print(arr2d[rowstart][col] + " ");
            }
            rowstart++;
            //2
            for(int row=rowstart;row<=rowend;row++){
                System.out.print(arr2d[row][colend] + " ");
            }
            colend--;
            //3
            for(int col = colend;col>=colstart;col--){
                System.out.print(arr2d[rowend][col] + " ");
            }
            rowend--;
            //4
            for(int row=rowend;row>=rowstart;row--){
                System.out.print(arr2d[row][colstart] + " ");
            }
            colstart++;
        }
    }
}