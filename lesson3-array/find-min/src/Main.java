import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();
        int[] array= new int[size];
        System.out.print("array: ");
        for(int i=0; i<array.length; i++){
            array[i]= (int)(Math.random()*100);
            System.out.print(array[i]+"\t");
        }
        int min = array[0];
        for(int i=0; i< array.length; i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println("\nmin là: "+min);


    }
        }
