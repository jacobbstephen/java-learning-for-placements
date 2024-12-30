import java.util.*;
public class NonRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num: arr){
            if(hm.containsKey(num)){
                hm.put(num, hm.get(hm.get(num)) + 1);
            }
            else hm.put(num, 1);
        }
        System.out.println(hm);
        for(Integer key: hm.keySet()){
            if(hm.get(key) == 1)
                System.out.println(key);
        }
    }
}
