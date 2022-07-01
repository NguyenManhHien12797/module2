import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which month that you want to count days?");
        int month = scanner.nextInt();
        String daysInMonth;
        switch (month){
            case 2:
//                System.out.println("The month 2 has 28 or 29 days!");
                daysInMonth= "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
//                System.out.println("The month "+month+" has 31 days! ");
                daysInMonth= "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
//                System.out.println("The month "+ month+" has 30 days!");
                daysInMonth= "30";
                break;
            default:
//                System.out.println("Invalid input!");
                daysInMonth = "";

        }
        if (daysInMonth != "") System.out.printf("The month %d has %s days!", month, daysInMonth);
        else System.out.println("Invalid input!");
    }
}
