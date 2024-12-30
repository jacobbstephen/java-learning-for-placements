import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < 10; i++)
            arr[i] = s.nextInt();
        int min = 0;
        for(int j = 0; j < 10; j++){
            
                if (arr[j] < arr[min])min = j;
        }
        System.out.print(arr[min]);
    }
}
