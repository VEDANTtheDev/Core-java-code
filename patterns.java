import java.util.Scanner;

public class patterns{
    public static void main(String[] args) {
        /*int n = 4;
        for(int i = 1;i<=n; i++){
            for (int j=1;j<=i;j++){
            System.out.print("*");
            }
            for(int j = 1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n;i>=1; i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j = 1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        //Next Pattern

        /*int n = 5;

        for(int i = 1;i<=n;i++){
            for(int j= 1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(int j = 1;j<=5;j++){
                System.out.print("*");

            }
            System.out.println();
        }*/

        //3rd Pattern

        /*int n = 5;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if (j%2==0){
                    System.out.print(" ");
                } else {
                    System.out.print(i);
                }
            }
            System.out.println();
        }*/

        //4th pattern

      /*  int n = 5;

        for(int i = 1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //1st half
            for(int j=i;j>=1;j--) {
                System.out.print(j);
            }
            //2nd half
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }*/

        //5th Pattern

        int n = 4;
        //1st half

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half

        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


