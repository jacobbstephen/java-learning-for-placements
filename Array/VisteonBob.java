public class VisteonBob {
    public static boolean containsDislikedDigits(int amount, int digits[]){
        String nums = String.valueOf(amount);
        for(char ch: nums.toCharArray()){
            for(int digit : digits){
                if(ch == (char) ('0' + digit))
                    return true;
            }
        }
        return false;
    }
    public static int calculateFinalAmount(int N, int m, int digits[]){
        int amount = N;
        while(containsDislikedDigits(amount, digits))
            amount++;
        return amount;
    }
    public static void main(String[] args) {
        int digits[] = {0,2,4};
        int N = 400;
        int m = 2;
        int ans = calculateFinalAmount(N, m, digits);
        System.out.println(ans);
    }
}
