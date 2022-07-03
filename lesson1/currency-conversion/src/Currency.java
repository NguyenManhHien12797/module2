import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        final int rate= 23000;
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the amount to be converted:");
            int usd = scanner.nextInt();
            System.out.println("Result = "+(rate*usd)+ "VND");
            System.out.println("-----------------------------");
        }

    }
}
