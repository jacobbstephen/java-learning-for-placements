public class noOfBits {
    public static void main(String[] args) {
        int n = 15;
        int count = 0;
        System.out.println(Integer.toBinaryString(n));
        while (n > 0){
            //n -= (n & -n);
            n = n & (n - 1);
            count++;
        }
        System.out.println(count);
    }
}
