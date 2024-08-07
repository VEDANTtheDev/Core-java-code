import java.util.Scanner;

public class stringsBuilder {
    public static void main(String[] args) {
        /*StringBuilder sb = new StringBuilder("Tony"); //Declaration
        System.out.println(sb);
        // Get A Character from Index
        System.out.println(sb.charAt(0));
        //Set a Character at Index
        sb.setCharAt(0,'P');
        System.out.println(sb);
        // Insert a Character at Some Index
        sb.insert(0,'S');
        System.out.println(sb);
        //Delete char at some Index
        sb.delete(0,1);
        System.out.println(sb);
        //Append a char
        sb.append('x');
        System.out.println(sb);
        //Print Length of String
        System.out.println(sb.length());
        */

        //Reverse a String (using StringBuilder class)
        StringBuilder sb = new StringBuilder("HelloWorld");
        for (int i=0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length()-i-1;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);




    }
}