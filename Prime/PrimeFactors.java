import java.util.*;
public class PrimeFactors {
    static boolean isPrime(int num){
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for(int i = 2; i <= n / 2; i++){
            if(n % i == 0){
                if(isPrime(i))
                    list.add(i);
            }
        }
        System.out.println(list);
    }
}
