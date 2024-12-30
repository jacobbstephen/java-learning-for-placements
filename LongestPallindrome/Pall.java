import java.util.*;

public class Pall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String of Characters: ");
        String str = sc.nextLine();
        // Count the characters
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char ch: str.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        // if even the can be used to  do the pall
        int length = 0;
        boolean oddValue = false;
        for(int count: hm.values()){
            if(count % 2 == 0){
                length += count;
            }else{
                length += count - 1;
                oddValue = true;
            }
        }
        if(oddValue) length += 1;
        System.out.println(length);
    }
}
