public class GoodPrime {
    public static int sumOfDigits(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        
        return sum;
    }
    public static boolean isPrime(int sum){
        if(sum <= 1) return false;
        if(sum <= 3) return true;
        if(sum % 2 == 0 || sum % 3 == 0) return false;
        for(int i = 5; i <= Math.sqrt(sum); i++){
            if(sum % i == 0) return false;
        }
        return true;
    }
    public static void solve(int n, int k){
        int ans = 0;
        while(k > 0){
            int sum = sumOfDigits(n);
            if(isPrime(sum)) {
                System.out.println(sum);
                k--;
                ans = n;
            }
            n++;
        }
        System.out.println("ANs: " + ans);
    }
    public static void main(String[] args) {
        solve(4, 4);
    }   
}
