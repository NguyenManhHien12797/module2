import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        int[] array= new int[5];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<5; i++){
            System.out.println("Moi ban nhap diem sv thu " +(i+1));
            int diem= scanner.nextInt();
            while (diem<0|| diem>10){
                System.out.println("Moi ban nhap lai diem");
                System.out.println("Moi ban nhap diem sv thu "+(i+1));
                diem= scanner.nextInt();
            }
                array[i]= diem;

        }
        for(int a:array){
            System.out.print(a+ "\t");
        }
        int count = 0;
        System.out.print("List of mark: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("\n The number of students passing the exam is " + count);
    }
}
