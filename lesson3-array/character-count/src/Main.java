import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String countString = "abcdef";
        int count= 0;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhập ký tự cần đếm: ");
        String kyTu = scanner.nextLine();
        for(int i=0;i<countString.length();i++){
           char ch= countString.charAt(i);
           String a= String.valueOf(ch);
            if(kyTu.equals(a)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
