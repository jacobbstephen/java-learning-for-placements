import java.util.*;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{1, 2, 3, 4};
        int ans[] = new int[4];

        int prefix = 1;
        int postfix = 1;
 
        for(int i = 0; i < arr.length; i++){
            ans[i] = prefix;
            prefix *= arr[i];
        }
        for(int i = arr.length - 1; i >= 0; i--){
            ans[i] *= postfix;
            postfix *= arr[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
