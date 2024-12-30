class TargetSum{
    public static boolean find(int[] nums, int i, int sum, int target){
        if( i != 0 && sum == 0) return false;
        if(sum == target )return true;

        for(int j = i; j < nums.length; j++){
            sum += nums[j];
            target -= sum;
            if(find(nums,i + 1 ,sum, target)) {
                return true;
            };
        }
        return false;
    }
    public static void main(String args[]){
        int nums[] = {5, 12, 3, 1, 9};
        
        boolean ans = find(nums, 0,0, 30);
        System.out.println(ans);
    }
}