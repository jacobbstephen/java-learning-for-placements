public class SearchString {
    public static void main(String[] args) {
        String str = "JACOB";
        char target = 'M';
        System.out.println(search(str, target));
    }

    static boolean search(String str,char target){
        if (str.length() == 0) return false;
        /*for(int i = 0; i < str.length(); i++){
            if (str.charAt((i)) == target) return true;
        }
        return false;*/
        // for each loop
        // converts the String into a sequence of characters
        for(char ch: str.toCharArray()){
            if (ch == target) return true;
        }
        return false;
    }
}
