public class Power {
    public static void main(String[] args) {
        int base = 2;
        int exp = 10;
        int ans = 1;
        while (exp > 0){
            if((exp & 1) == 1) ans *= base;
            base *= base;
            exp = exp >> 1;
        }
        System.out.println(ans);
    }
}
