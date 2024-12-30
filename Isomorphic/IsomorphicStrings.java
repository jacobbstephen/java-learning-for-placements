import java.util.*;
public class IsomorphicStrings {
    static HashMap <Character, Character> hm = new HashMap<>();
    static boolean check(String str, String repString){
        if(str.length() != repString.length()) return false;
        for(int i = 0; i < str.length(); i++){
            char orginal = str.charAt(i);
            char replacement = repString.charAt(i);
            if(hm.containsKey(orginal)){
                char mapped = hm.get(orginal);
                if(mapped != replacement) return false;
            }
            else{
                if(hm.containsValue(replacement)) return false;
                hm.put(orginal, replacement);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String: ");
        String str = sc.nextLine();
        System.out.print("Enter The Replacement String: ");
        String repString = sc.nextLine();
        System.out.println(check(str, repString));

    }
}
