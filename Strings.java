import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        String name = "Vedant"; //Declaration
        System.out.println(name);
        //Taking string as input
        Scanner sc = new Scanner(System.in);
        String var = sc.next(); //Single word
        String sentence = sc.nextLine();//Multiple words
        System.out.println(var);
        System.out.println(sentence);
        //Concatenation
        String firstname = "Vedant";
        String lastName = "Narlawar";
        String fullName = firstname + " " + lastName;
        System.out.println(fullName);
        //Length of string
        String secondName = "Bhupesh";
        System.out.println(secondName.length());
        //Access char of string
        System.out.println(secondName.charAt(3)); //charAt is used to access char from string
        //Compare two strings
        if(firstname.equals(secondName)) {
            System.out.println("Equal names!");
        }
        else {
            System.out.println("Unequal names");
        }
        //Printing substring of a string
        System.out.println(name.substring(0,3));
        //String to integer conversion using integer class
        String num = "12345";
        int number = Integer.parseInt(num);
        System.out.println(number);
        //integer to string conversion using String class
        String str = Integer.toString(number);
        System.out.println(str);
    }
}