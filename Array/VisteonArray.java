class VisteonArray{
    public static boolean isPrime(int cnt){
        if(cnt <= 1) return false;
        for(int i = 2; i <= cnt / 2; i++){
            if(cnt % i == 0) return false;
        }
        return true;
    }
    public static String remove(String s){
        int count[] = new int[26];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < s.length(); i++){
            int cnt =count[s.charAt(i) - 'a'];
            if(!isPrime(cnt))  sb.append(s.charAt(i));
        }
        return sb.isEmpty() ? "Mary" : sb.toString();
    }
    public static void main(String[] args) {
        String s = "aaabbc";
        String r = remove(s);
        System.out.println(r);
    }

}