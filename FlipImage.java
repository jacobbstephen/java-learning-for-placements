import java.util.Arrays;

public class FlipImage {
    public static void main(String[] args) {
        
    int[][] image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
    for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image[i].length ; j++){
                System.out.print(image[i][j]);
            }
            System.out.println();
    }
    flipAndInvertImage(image);
    for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image[i].length ; j++){
                System.out.print(image[i][j]);
            }
            System.out.println();
    }
    }
    static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row: image){
            for(int j = 0; j < (image[0].length + 1) / 2; j++){
                int temp = row[j] ^ 1;
                row[j] = row[image[0].length - j - 1] ^ 1;
                row[image[0].length - j - 1] = temp;
            }
        }
        return image;
    }
}
