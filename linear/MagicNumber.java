public class MagicNumber {
    public static void main(String[] args) {
        int n = 1;
        int ans = 0;
        int base = 5;
        while(n > 0){
            int last = n & 1;
            ans += base * last;
            n = n>>1;
            base *= 5;
        }
        System.out.println(ans);
    }
}
