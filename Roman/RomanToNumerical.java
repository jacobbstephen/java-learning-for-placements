import java.util.*;
public class RomanToNumerical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the roman No: ");
        String roman = sc.nextLine();
        int ans = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        for(int i = 0; i < roman.length(); i++){
            char ch = roman.charAt(i);
            if(i + 1 != roman.length() && hm.get(ch) < hm.get(roman.charAt(i + 1))){
                ans += hm.get(roman.charAt(i + 1)) - hm.get(ch);
                i++;
            }
            else ans += hm.get(ch);
        }
        System.out.println(ans);
    }
}
