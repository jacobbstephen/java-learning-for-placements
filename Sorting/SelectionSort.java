import java.util.*;
public class SelectionSort {
    public static  int findmin(int arr[], int start){
        int min = start;
        for(int i = start + 1; i < arr.length; i++){
            if(arr[i] < arr[min]) min = i;
        }
        return min;
    }
    public static void selection(int arr []){
        for(int i = 0; i < arr.length - 1; i++){
            int min = findmin(arr,i);
            // System.out.println(min);
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void main(String[] args) {
        
        
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];


        System.out.println("Enter the elements of the array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        selection(arr);
        System.out.println("Elements of the array:");
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
