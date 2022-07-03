import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
//        while (true){
//            Scanner scanner= new Scanner(System.in);
//            System.out.println("Enter the number:");
//            boolean check= false;
//            int number= scanner.nextInt();
//            if(number<2){
//                System.out.println(check);
//            }else {
//                if(number<4){
//                    check= true;
//                    System.out.println(check);
//                } else {
//                    if(number>=4){
//                        for(int i=2; i<=Math.sqrt(number);i++){
//                            if(number%i==0){
////                                check= false;
////                                System.out.println(check);
////                                break;
//                            }
//                        }
////                           for(int i=2; i<= Math.sqrt(number);i++){
////                               if(number%i !=0){
////                                   check= true;
////                                   System.out.println(check);
////                                   break;
////                               }
////                        }
//                    }
//                }
//            }
//            System.out.println("------------------------");
//        }
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number:");
            int number = scanner.nextInt();
            System.out.println(isPrime(number));
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
