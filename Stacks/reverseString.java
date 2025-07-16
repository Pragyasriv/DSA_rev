import java.util.Stack;

public class reverseString {
    public static String reverse(String str) {
        Stack<Character> s = new Stack<>();
        for(char c : str.toCharArray()) {
            s.push(c);
        }

        StringBuilder res = new StringBuilder();
        while(!s.isEmpty()) {
            res.append(s.pop());
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(s);
        System.out.println(reverse(s));
    }
}
