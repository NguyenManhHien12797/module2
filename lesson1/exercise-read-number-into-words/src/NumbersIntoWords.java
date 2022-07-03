import java.io.FileInputStream;
import java.util.Scanner;

public class NumbersIntoWords {
    public static void main(String[] args) {
        int[] number = {0,1,2,3,4,5,6,7,8,9};

        String[] nuberIntoWords = {"không","một","hai","ba","bốn","năm","sáu","bảy","tám","chín"};
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter your number:");
            int num = scanner.nextInt();
            int surplus = num%10;
            int surplus1= num%100;
            int quotient= num/10; // thương số
            int quotient1= num/100; // thương số
            String convert= "";
            if(0<= num && num < 10){
                for(int i=0; i<10; i++){
                    if(num== number[i] ){
                        System.out.println(nuberIntoWords[i]);
                    }
                }
            }
            else {
                if (num>10){
                    for(int i= 0; i<10; i++){
                        if(surplus==0 && quotient== number[i]){
                            System.out.println(nuberIntoWords[i] + " mươi");
                        }
                    }
                }
                if(num<20){
                    if(surplus==0){
                        System.out.println("Mười");
                    }
                    for(int i=1; i<10; i++){

                        if(surplus== number[i]){
                            System.out.println("Mười "+ nuberIntoWords[i]);
                        }
                    }
                }else {
                    if(num<=99){
//                        String convert= "";
                        for(int i=1; i<10; i++){
                            if(quotient==number[i]){
                              convert = nuberIntoWords[i]+ " mươi ";
                            }
                        }
                        for(int i=0; i<10; i++){
                            if(surplus== number[i]){
                                System.out.println(convert+ nuberIntoWords[i]);
                            }
                        }
                    } else {
                        String convert1="";
                        if(num<=999){
                            int quotient2= surplus1/10;
//                            System.out.println(surplus);
//                            System.out.println(quotient2);
//                            System.out.println(quotient1);
                            for(int i=1; i<10;i++){
                                if(quotient1==number[i]){
                                    convert= nuberIntoWords[i]+ " trăm ";
                                }
                            }
                            if(quotient2==0 &&surplus == 0){
                                System.out.println(convert);
                            } else {
                                for(int i=0; i<10; i++){
                                    if(quotient2==0){
                                        convert1 = convert+ " lẻ ";
                                    } else {
                                        if(quotient2==1){
                                            convert1 = convert+ " mười ";
                                        } else {
                                            if(quotient2==number[i]){
                                                convert1 = convert+ nuberIntoWords[i]+ " mươi ";
                                            }
                                        }
                                    }
                                }
                            }
                                if(surplus==0){
                                    System.out.println(convert1);
                                } else {
                                    for (int i = 0; i < 10; i++) {
                                        if (surplus == number[i]) {
                                            System.out.println(convert1 + nuberIntoWords[i]);
                                        }
                                    }
                                }
                        }
                    }
                }
            }
            System.out.println("----------------------Hello----------------------------");
        }
    }
}

