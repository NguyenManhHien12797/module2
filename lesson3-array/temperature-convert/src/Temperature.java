import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        System.out.printf("%s\n%s\n%s\n%s",
                "Menu", "1. Fahrenheit to Celsius", "2. Celsius to Fahrenheit", "0. Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a choice:");
        int choice = -1;
        while (choice != 0) {
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("You choice: 1. Fahrenheit to Celsius");
                    System.out.print("Enter a number: ");
                    int number = scanner.nextInt();
                    System.out.print(number + " độ F = ");
                    System.out.println(fahrenheitToCelsius(number) + " độ c");
                    System.out.println("-----end choice-----");
                    System.out.print("\n Enter a choice:");
                    break;
                }
                case 2: {
                    System.out.println("You choice: 2. Celsius to Fahrenheit");
                    System.out.print("Enter a number: ");
                    int number = scanner.nextInt();
                    System.out.print(number + " độ C = ");
                    System.out.println(celsiusToFahrenheit(number) + " độ F");
                    System.out.println("-----end choice-----");
                    System.out.print("\n Enter a choice:");
                    break;
                }
                case 0: {
                    System.out.println("You choice Exit: OK exit");
                    System.exit(0);
                }
            }
        }
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
}
