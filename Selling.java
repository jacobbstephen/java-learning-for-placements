public class Selling {
    public static void main(String[] args) {
        int n = 3;
        // int[] uniqueId = {4, 6, 3, 3, 4};
        // int[] profit = {-1, 10, 10, 15, -5};
        int[] uniqueId = {1, 2, 3};
        int[] profit = {10, 20, 30};
        int m = 3;
        int i = 0, j = 0;
        int max = 0;
        while(i < n && j < m){
            int sum = profit[j] > 0 ? profit[j] : 0;
            while( i < n - 1 && uniqueId[i] == uniqueId[i + 1]){
                sum = Math.max(sum, profit[j + 1]);
                i++; j++;
            }
            max += sum;
            i++; j++;
        }
        System.out.println(max);
    }
}
