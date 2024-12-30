package BinarySearch;
import java.util.*;
public class BinarySearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int left = 0;
        int right = n - 1;
        System.out.println("Enter the target element: ");
        int target = sc.nextInt();
        boolean found = false;
        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == target ) {
                found = true;
                break;
            }else if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        if(found) System.out.println("Element found ");
        else System.out.println("Element not found ");
    }
}