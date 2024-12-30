public class AmusementPark {
    public static String discount(String ticket, int k){
        StringBuilder sb = new StringBuilder(ticket);
        for(int i = 0; i < k; i++){
            if(sb.length() > 0){
                sb.deleteCharAt(0);
            }
        }
        int value = 0;
        for(int i = 0; i < sb.length(); i++){
            char ch = sb.charAt(i);
            value += ch - '0';
        }
        if(sb.length() == 0 || value == 0 )
            return "1";
        return sb.toString();
    }
    public static void main(String[] args) {
        String ticket =  "100";
        int k = 2;
        System.out.println(discount(ticket, k));
    }
}
