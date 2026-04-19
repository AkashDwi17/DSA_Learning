package Stack;
import java.util.*;

public class _5ReverseString {
    public static String reverseString (String str){
        Stack <Character> s = new Stack <>();
        StringBuilder sb = new StringBuilder ("");

        for (int i=0; i<str.length(); i++){
            s.push (str.charAt(i));
        }
        while (!s.isEmpty()){
            sb.append(s.pop());
        }
        return sb.toString();
    }
    public static void main (String args[]){
        String str = "abc";
        System.out.println(reverseString(str));
    }
}
