import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        int max= matrix[0][0];
        int indexi=0;
        int indexj=0;
        for(int i = 0; i<matrix.length; i++){
            for(int j=0; j< matrix[i].length;j++){
                if(matrix[i][j]>max){
                    max= matrix[i][j];
                    indexi= i;
                    indexj= j;
                }
            }
        }
        System.out.println("index: "+indexi+"-"+ indexj);
        System.out.println("Max là: "+max);

    }
}
