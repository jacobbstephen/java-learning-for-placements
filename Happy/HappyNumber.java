import java.util.*;
public class HappyNumber {
    static boolean isHappy(int num){
        HashSet<Integer> set = new HashSet<>();
        while(true){
            int sum = 0;
            while(num >0){
                int digit =  num % 10;
                sum += digit * digit;
                num /= 10;
            }
            if(sum == 1) return true;
            num = sum;
            System.out.println(num);
            if(set.contains(num)) return false;
            set.add(num);
        }
    }
    public static void main(String[] args) {
        int num = 19;
        System.out.println(isHappy(num));
    }
}
