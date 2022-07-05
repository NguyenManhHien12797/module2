import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size array: ");
        int size = scanner.nextInt();
        int[]array= new int[size];
        for(int i= 0; i<array.length; i++){
            System.out.print("Enter element "+i+ " :");
            array[i]= scanner.nextInt();
        }
        System.out.print("Enter the number you want to delete:");
        int number= scanner.nextInt();
            for(int i= 0; i<array.length;i++){
                if(number==array[i]){
                    System.out.println("index là: "+i);
                }
            }
            for(int i=0; i< array.length; i++){
                if(number== array[i]){
                    int j= i;
                    while (j< array.length-1){
                        array[j]= array[j+1];
                        array[j+1]=0;
                        j++;
                    }
                    i--;
                }
            }
            for(int i= 0; i< array.length; i++){
                System.out.println(array[i]);
            }
    }
}
