public class Xor {
    public static void main(String[] args) {
        int[] arr = {2,3,5,2,3};
        System.out.println(ans(arr));
    }
    static int ans(int[] arr){
        int unique = 0;
        for(int n: arr) unique ^= n;
        return unique;
    }
}
