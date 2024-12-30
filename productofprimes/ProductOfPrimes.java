import java.util.*;
public class ProductOfPrimes {
    public static void main(String[] args) {
        int n = 20;
        // step 1 find all the prime no till n => seieve of Eratosthenes
        boolean isPrime[] = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        List<String> ans = new ArrayList<>();
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(isPrime[i]){
                for(int multiple = i * i; multiple <= n; multiple += i){
                    isPrime[multiple] = false;
                }
            }
        }
        for(int i = 0; i < n; i++){
            if(isPrime[i]){
                for(int j = i; j < n; j++){
                    if(isPrime[j]){
                        if(i * j <= n){
                            String res = "( " + i + ", " + j + " )";
                            ans.add(res); 
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
