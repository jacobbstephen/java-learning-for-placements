import java.util.*;
public class Freq {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> hm = new HashMap<>();
        System.out.print("Enter the String: ");
        str = sc.nextLine();
        for(char ch: str.toCharArray()){
            if(hm.containsKey(ch))
                hm.put(ch, hm.get(ch) + 1);
            else 
                hm.put(ch, 1);
        }
        for(Character key: hm.keySet()){
            System.out.println("{" + key + " = " +   hm.get(key) + "}");
        }
        System.out.println(hm);

    }
}
