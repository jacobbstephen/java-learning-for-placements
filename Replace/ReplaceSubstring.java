import java.util.*;
class ReplaceSubstring {
    static String stringReplace(String str, String subStr, String replaceStr){
        int index = str.indexOf(subStr);
        String res = str.substring(0, index) + replaceStr + str.substring(index + subStr.length());
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        System.out.print("Enter the SubString: ");
        String subStr = sc.nextLine();
        System.out.print("Enter the Replace String: ");
        String replaceStr = sc.nextLine();
        System.out.println(stringReplace(str, subStr, replaceStr));
    }
    
}