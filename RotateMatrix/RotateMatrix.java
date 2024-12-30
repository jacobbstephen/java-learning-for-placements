import java.util.*;
public class RotateMatrix {
    static void swap(int matrix[][], int i, int j){
        int temp =  matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    static void printMatrix(int matrix[][]) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    static void reverse(int matrix[]){
        int start = 0, end = matrix.length - 1;
        while(start <= end){
            int temp =  matrix[start];
            matrix[start]= matrix[end];
            matrix[end] = temp;
            start++; end--;
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        // transpose the matrix
        for(int i = 0; i < matrix.length; i++){
            for(int j = i + 1; j < matrix.length; j++){
                swap(matrix, i, j);
            }
        }

        // reverse the rows of the matrix
        for(int[] row : matrix){
            reverse(row);
        }

        printMatrix(matrix);
    }
}
