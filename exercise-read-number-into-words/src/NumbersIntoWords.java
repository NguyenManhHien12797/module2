import java.util.Scanner;

public class NumbersIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        String numberIntoWords="";
        if ( number < 10 && 0<= number) {
            switch (number) {
                case 0:
//                    System.out.println("Không");
                    numberIntoWords= "Không";
                    break;
                case 1:
//                    System.out.println("Một");
                    numberIntoWords= "Một";
                    break;
                case 2:
//                    System.out.println("Hai");
                    numberIntoWords= "Hai";
                    break;
                case 3:
//                    System.out.println("Ba");
                    numberIntoWords= "Ba";
                    break;
                case 4:
//                    System.out.println("Bốn");
                    numberIntoWords= "Bốn";
                    break;
                case 5:
//                    System.out.println("Năm");
                    numberIntoWords= "Năm";
                    break;
                case 6:
//                    System.out.println("Sáu");
                    numberIntoWords= "Sáu";
                    break;
                case 7:
//                    System.out.println("Bảy");
                    numberIntoWords= "Bảy";
                    break;
                case 8:
//                    System.out.println("Tám");
                    numberIntoWords= "Tám";
                    break;
                case 9:
//                    System.out.println("Chín");
                    numberIntoWords= "Chín";
                    break;
            }
        }else {
            if(number<20){
                switch (number) {
                    case 10:
//                        System.out.println("Mười");
                        numberIntoWords= "Mười";
                        break;
                    case 11:
//                        System.out.println("Một");
                        numberIntoWords= "Mười một";
                        break;
                    case 12:
                        System.out.println("Hai");
                        break;
                    case 3:
                        System.out.println("Ba");
                        break;
                    case 4:
                        System.out.println("Bốn");
                        break;
                    case 5:
                        System.out.println("Năm");
                        break;
                    case 6:
                        System.out.println("Sáu");
                        break;
                    case 7:
                        System.out.println("Bảy");
                        break;
                    case 8:
                        System.out.println("Tám");
                        break;
                    case 9:
                        System.out.println("Chín");
                        break;
                }
            }
        }
        if(!numberIntoWords.equals("")){
            System.out.println(numberIntoWords);
        }
    }
}

