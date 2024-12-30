public class MinCostPath {

    private static final int MOD = 1000000007;

    public static int minCost(int N, int[] A, int[] B) {
        // Adjust indices to be 1-based
        int[] dp = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        
        dp[N] = A[N];  // Starting point
        
        // Iterate from N down to 1
        for (int i = N; i >= 1; i--) {
            int currentCost = 0;
            for (int j = i + 1; j <= N; j++) {
                currentCost += B[i];
                dp[i] = Math.min(dp[i], dp[j] + currentCost + A[i]);
            }
        }
        
        return dp[1] % MOD;
    }

    public static void main(String[] args) {
        int N = 5;
        int[] A = {5, 4, 2, 4, 4, 1};  // Adjust index to be 1-based
        int[] B = {1, 1, 4, 3, 3, 4};  // Adjust index to be 1-based
        Integer.MAX_VALUE

        System.out.println(minCost(N, A, B));  // Output will be the minimum cost from N to 1
    }
}
