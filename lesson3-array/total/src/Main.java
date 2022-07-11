import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the row: ");
        int row= scanner.nextInt();
        System.out.print("Enter the column: ");
        int column= scanner.nextInt();
        int[][] array= new int[row][column];
        for(int i=0; i< array.length; i++){
            for(int j=0; j< array[i].length;j++){
                array[i][j]= (int)(Math.random()*100);
                System.out.print(array[i][j]+"  ");
            }
            System.out.println();
        }
        int total=0;
        System.out.print("Mời nhập vào cột muốn tính tổng: ");
        int totalrow= scanner.nextInt();
        for(int i=0; i< array.length; i++){
            total+=array[i][totalrow-1];
            for(int j=0; j< array[i].length; j++){

            }
        }
        System.out.println("Tổng số phần tử của côt thứ "+totalrow+" là: "+total);
    }
}
