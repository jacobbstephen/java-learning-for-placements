import java.util.*;
public class Search {

    public static void main(String[] args) {
        int[] array = {45,69,78,32,12,41};
        int index = search(array, 78);
        if(index != -1)  System.out.println("Element found at index: " + index);
        else System.out.println("Element not found");

    }

    static int search(int[] arr, int data){
        int ind = -1;
        for (int i = 0; i < arr.length; i++){
            if (data == arr[i]) {
                ind = i;
                return(ind);

            }
        }
        return(ind);  
    }
    
}
