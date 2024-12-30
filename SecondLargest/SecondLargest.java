import java.util.*;
public class SecondLargest {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Enter the size of the array: ");
    n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the Elements: ");
    for(int i = 0; i < n; i++)
        arr[i] = sc.nextInt();
    
        int secondLargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int num: arr){
             if(num > largest){
                secondLargest = largest;
                largest = num;
             }else if(num > secondLargest && num != largest)
                 secondLargest = num;
        }  
        System.out.println("Second Largest: " + secondLargest);
        System.out.println("Largest: " +largest);
   } 
}
