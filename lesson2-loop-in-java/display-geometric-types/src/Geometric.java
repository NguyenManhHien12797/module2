import java.util.Scanner;

public class Geometric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice= -1;
        while (choice!=5){
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print the square triangle cạnh góc vuông ở top-left ");
            System.out.println("4. Print isosceles triangle");
            System.out.println("5. Exit");
            System.out.println("------------------------------");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1: {
                    for(int i=0; i<3; i++){
                        System.out.println("* * * * * * * *");
                    }
                    break;
                }
                case 2: {
                    String print= " ";
                    for(int i=0; i<5; i++){
                        print+=" * ";
                        System.out.println(print);
                    }
                    break;
                }
                case 3: {
                    String print= " ";
                    for(int i=0; i<=5; i++){
                        print=" ";
                        System.out.println(print);
                        for(int j=0; j<=(5-i); j++){
                            print+=" * ";
                        }
                        System.out.println(print);
                    }
                    break;
                }
                case 4: {
                    String print= " ";
                    for(int i=0; i<=5; i++){
                        print=" ";
                        System.out.println(print);
                        for(int j=0; j<=(5-i); j++){
                            print+=" ";
                        }
                        for (int j= 0; j<i; j++){
                            print+= " * ";
                        }
                        System.out.println(print);
                    }
                    break;
                }
                case 5:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
            System.out.println("--------------------------");
        }
    }
}
