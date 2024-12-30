class RotateArray {
    public static void reverse(int[] arr, int start, int end){
        while(start <= end){
            int temp =  arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int k = 2;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        for(int num : arr){
            System.out.println(num);
        }
        
    }
}