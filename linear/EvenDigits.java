public class EvenDigits {
    public static void main(String[] args) {
        
        int[] arr = {12, 345, 2, 6, 7896};
        int count = 0;
        for(int num : arr){
            if(check(num)) {
                count++;
                System.out.println(num);
            }
        }
        System.out.println(count);
    }
    static boolean check(int num){ 
        if((noOfDigits(num) & 1) == 1) return false;
        else return true;
    }
    static int noOfDigits(int num){
        if(num < 0) num *= -1;
        return (int) (Math.log10(num) + 1);
    }
}
