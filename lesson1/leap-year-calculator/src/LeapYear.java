import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Number of years want to check? ");
        int year= scanner.nextInt();
        if(year%4 == 0 && year%100 != 0){
            System.out.println(""+year+" là năm nhuận");
        } else{
            if(year%100 == 0 && year%400 == 0){
                System.out.println(""+year+" là năm nhuận");
            } else System.out.println(""+year+" không phải năm nhuận");
        }
    }
}
