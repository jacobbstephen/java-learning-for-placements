
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num: ");
        int num = sc.nextInt();
        int sum = 1;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                sum += i;
                if(i != num / i)
                    sum += num / i;
            }
        }
        if(sum == num) System.out.println("Perfect Number");
        else System.out.println("Not Perfect Number");
    }
}
