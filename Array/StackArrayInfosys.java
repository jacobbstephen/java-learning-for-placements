import java.util.*;
public class StackArrayInfosys {
    
    public static String SmallestString(String s){
        char arr[] = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char ch: arr){
            if(!stack.isEmpty() && (stack.peek() == '1' && ch == '0') ){
                stack.pop();
                while(!stack.isEmpty() && stack.peek() == '1')
                    stack.pop();
            }
            stack.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        for(char ch: stack){
            sb.append(ch);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "011011011111";
        System.out.println(SmallestString(s));
    }
}
