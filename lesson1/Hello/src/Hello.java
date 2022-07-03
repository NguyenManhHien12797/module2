import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name= scanner.next();
        System.out.printf("Hello %s",name);

    }
}
