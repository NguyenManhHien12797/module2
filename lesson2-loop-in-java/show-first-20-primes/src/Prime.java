import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number:");
            int number = scanner.nextInt();
            System.out.println(isPrime(number));
            System.out.println("--------------------------------");
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2)
            return false;
        if (number < 4) {
            return true;
        }
        if (number >= 4) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
