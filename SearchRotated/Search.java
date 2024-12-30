public class Search {
    public static void main(String[] args) {
        int arr[] = new int[]{4, 5, 6, 7, 0, 1, 2, 3};
        int left = 0;
        int right = arr.length - 1;
        int target = 0;
        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == target) {
                System.out.println(mid);
                break;
            }
            else if(arr[left] <= arr[mid]){
                if(arr[left] <= target && target <= arr[mid] ) right = mid - 1;
                else left = mid + 1;
            }
            else{
                if(arr[mid] <= target && target <= arr[right] )left = mid + 1;
                else right = mid - 1;
            }
        }
    }
}
