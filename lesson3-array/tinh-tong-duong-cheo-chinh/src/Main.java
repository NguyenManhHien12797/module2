import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int row= scanner.nextInt();
        System.out.print("Enter the column: ");
        int column= scanner.nextInt();
        int[][] array= new int[row][column];
        for(int i= 0 ; i< array.length; i++){
            for(int j=0; j< array[i].length; j++){
                array[i][j]= (int)(Math.random()*100);
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        int cc=0;
        int cp=0;
        for(int i= 0; i< array.length; i++){
            for(int j=0; j< array[i].length;j++){
                if(i==j){
                    cc+= array[i][j];
                }
                if(j== array.length-i){
                    cp+= array[i][j];
                }
            }
        }
        int total= cc+cp;
        System.out.println("Tổng 2 đường chéo là: "+total);
    }
}
