import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size ");
        int size = scanner.nextInt();
        int[] array = new int[size];
       for (int i= 0; i<size-3;i++){
           array[i]=i;
       }
        System.out.print("Enter the index: ");
        int index = scanner.nextInt();
        System.out.print("Enter the value: ");
        int x= scanner.nextInt();
        for(int i= size -1;i>index;i--){
            array[i]= array[i-1];
        }
        for( int i= 0; i<size; i++){
            if(i == index){
              int temp = array[i];
              array[i]= x;
            }
        }
        for(int a:array){
            System.out.print(a+ "\t");
        }
    }
}