import java.util.Scanner;

public class practiceProblemString{
    public static void main(String[] args) {
        //Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of string you want to enter in array: ");
        int size = sc.nextInt();
        String[] Array = new String[size];
        int totlength = 0;

        //input
        for(int i = 0;i<size;i++){
            Array[i] = sc.next();
            totlength += Array[i].length();
        }

        System.out.println(totlength);*/

        //Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.next();
        String result = "";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'e'){
                result += "i";
            }else{
                result += str.charAt(i);
            }
        }
        System.out.println(result);*/
        //Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter E-mail: ");
        String email = sc.next();
        String userName = "";

        for (int i = 0;i<email.length();i++){
            if (email.charAt(i) == '@'){
                break;
            }else{
            userName += email.charAt(i);
            }
        }
        System.out.println(userName);
    }
}