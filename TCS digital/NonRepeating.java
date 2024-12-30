import java.util.*;
class NonRepeating {
    static int findAns(int start, int end){
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        while(start <= end){
            int n = start;
            while(n != 0){
                int last = n % 10;
                if(set.contains(last)){
                    break;
                }
                set.add(last);
                n = n / 10; 
            }
            if(n == 0) count++;
            set = new HashSet<>();
            start++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n1 = 101;
        int n2 = 200;
        int ans = findAns(n1, n2);
        System.out.println("Ans: " + ans);
    }
}
