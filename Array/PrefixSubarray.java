public class PrefixSubarray {
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        int sum = 0, max = Integer.MIN_VALUE;
        // calculate prefix sum
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i < prefix.length; i++)
            prefix[i] =  prefix[i - 1] + arr[i];
        for(int i = 0; i < arr.length; i++){
            for(int j = i ; j < arr.length; j++){
                sum = i == 0? prefix[j] :  prefix[j] - prefix[i - 1];
                if (sum > max) max = sum; 
                
            }
        }
        System.out.println(max);
    }
}
