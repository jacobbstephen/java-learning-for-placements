class MaximumToys{
    public static int compute(int[] toys, int budget){
        if(budget == 0) return 0;
        int start = 0, end = 0;
        int max = 0;
        int n = toys.length;
        int sum = 0;
        while(end  < n){
            sum += toys[end];
            while(sum > budget && start <= end){
                sum -= toys[start];
                start++;
            }

            int count = end - start + 1;
            max = Math.max(count, max);
            end++;  
        }
        return max;

    }
    public static void main(String[] args) {
        int toys[] = {1,4,5,3,2,1,6};
        int budget = 6;
        System.out.println(compute(toys, budget));
    }
}