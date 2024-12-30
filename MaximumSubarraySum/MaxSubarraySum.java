
public class MaxSubarraySum {
    public static void main(String[] args) {
        int num[] = new int[]{5,4,-1,7,8};
        int sum  = 0;
        int max = Integer.MIN_VALUE;
        int start = 0; int ansStart = 0, ansEnd = 0;
        for(int i = 0; i <  num.length; i++){
            if(sum == 0)  start = i;
            sum += num[i];
            if(sum > max) {
                max = sum;
                ansStart = start;
                ansEnd = i;
            } 
            if(sum < 0) sum = 0;
        }
        for(int i = ansStart; i <= ansEnd; i++)
            System.out.print(num[i] + " ");
        System.out.println("\n"+ max);
    }
}
