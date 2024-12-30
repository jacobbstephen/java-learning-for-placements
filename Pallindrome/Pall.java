import java.util.Scanner;

public class Pall {
    static boolean checkPall(String str){
        char[] strArr = str.toCharArray();
        int left = 0;
        int right = strArr.length - 1;
        while(left <= right){
            if(strArr[left] != strArr[right]) return false;
            left++; right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        System.out.println(checkPall(str));
    }
}
