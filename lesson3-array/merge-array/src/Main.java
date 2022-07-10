import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size1: ");
        int size1 = scanner.nextInt();
        int []array1= new int[size1];
        System.out.print("Enter the size2: ");
        int size2 = scanner.nextInt();
        int[] array2= new int[size2];
        for(int i= 0; i<size1; i++){
            array1[i]= i+1;
        }
        for(int i= 0; i<size2; i++){
            array2[i]= i+3;
        }
        System.out.println("Array1");
        for (int a:array1){
            System.out.print(a+ "\t");
        }
        System.out.println("\n Array2");
        for (int b:array2){
            System.out.print(b+ "\t");
        }
        int size3= size1+size2;
        int[] array3= new int[size3];
        for (int i = 0; i<size1; i++){
            array3[i]=array1[i];
        }
        for(int i=0; i<size2; i++){
            array3[i+size1]= array2[i];
        }
        System.out.println("\n Marge Array");
        for(int c:array3){
            System.out.print(c+ "\t");
        }
    }
}
