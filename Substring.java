import java.util.*;
import java.lang.String;
 
public class Substring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a String: ");
        String string1 = input.next();
        System.out.print("Substring you want to find: ");
        String string2 = input.next();
        if (isSubstring(string1, string2)) {
            System.out.println("Substring Found");
        } else {
            System.out.println("Substring not Found");
        }
    }   
    public static boolean isSubstring(String string1, String string2) {
        char c;
        char d;
        boolean match = true;
        for (int i = 0; i < string1.length(); i++) {
            c = string1.charAt(i);
            for (int j = 0; j < string2.length(); j++) {
                d = string2.charAt(j);
                if (c != d) {
                    match = false;
                } else {
                    match = true;
                }   
            }
        }
        return match;
    }
}
