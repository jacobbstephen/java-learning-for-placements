public class Airport {
    public static void main(String[] args) {
        int weight[] = {1,2,3,4};
        int T = 3;
        int N = weight.length;
        int total = 0;
        for(int i = 0; i < N; i++){
            total += 1;
            if(weight[i] > T) total++; 
        }
        System.out.println(total);
    }
}
