import java.util.Scanner;
public class recursion_reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(ReverseString(str));
    }
    static String ReverseString(String n){
        if (n.isEmpty()){
            return n;
        }
        return ReverseString(n.substring(1)) + n.charAt(0);
    }
}