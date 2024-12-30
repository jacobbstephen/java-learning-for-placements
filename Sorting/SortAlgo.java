import java.util.*;
public class SortAlgo {
    static int findMin(int[]arr, int start){
        int min = start;
        for(int i = start + 1; i <  arr.length; i++){
            if(arr[min] > arr[i]) min = i;
        }
        return min;

    }
    static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int min = findMin(arr, i);
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int curr = arr[i];
            int prev = i - 1;
            while(prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }
    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4,3,2,1};
        // insertionSort(arr);
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
