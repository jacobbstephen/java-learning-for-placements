import java.util.Arrays;

public class Trial {
    public static int majority(int nums[]){
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3};
        int major = majority(nums);
        System.out.println(major);
    }
}
