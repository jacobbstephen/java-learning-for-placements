
import java.util.*;
class Bubble{
    public static void main(String[] args) {
        int arr[] = new int[10];

        
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        System.out.println("Enter the elements of the array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }


        for(int i = 0; i < n; i++){
            for( int j = 0; j < n - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] =  temp;
                }
            }
        }
        System.out.println("Elements of the array:");
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }

}