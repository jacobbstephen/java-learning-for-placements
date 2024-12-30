import java.util.Arrays;
import java.util.Collections;

public class Avengers {
    public static void main(String[] args) {
        Integer[] strength = {10, 5, 8, 6, 7, 9, 4}; // Use Integer to enable sorting
        int sum = 0;
        
        // Calculate the total strength
        for (int i = 0; i < strength.length; i++) {
            sum += strength[i];
        }
        
        // Sort strengths in descending order
        Arrays.sort(strength, Collections.reverseOrder());
        
        int power = 0;
        int count = 0;
        
        // Add up strengths until the sum of remaining strengths is greater than half of the total
        for (int i = 0; i < strength.length; i++) {
            power += strength[i];
            if (power > sum - power) {
                count = i + 1;
                break;
            }
        }
        
        System.out.println(count);
    }
}
