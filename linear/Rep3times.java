public class Rep3times {
    public static void main(String[] args) {
        int[] arr = {2,2,4,2,7,7,8,7,8,8};
        int sum = 0; 
        for (int num : arr) sum += num;
        System.out.println(sum / 3); 
    }
}
