
public class BinarySearchCode {
    public static void main(String[] args) {
        int[] arr = {1,4,21,38,45,69,79,100,150,250,695,845};
        int target = 9;    
        if(Search(arr, target)) System.out.println("Element Found");
        else System.out.println("Element not Found");
    }

    static boolean Search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid =  start + (end - start)/ 2;
            if(target > arr[mid]) start = mid + 1;
            else if(target < arr[mid]) end = mid - 1;
            else return true;
        }
        return false;
    }
}
