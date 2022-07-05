import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        String[] billionaire = {"mắc-xoăn", "bin-gết", "trịnh-văn-mút", "rách-ma", "dép-b-dốt", "s-típ-dóp"};
        int index=1;
        int[] money;
        Scanner scanner = new Scanner(System.in);
        money = new int[6];
        int i = 0;
        while (i<money.length){
            System.out.println("Enter amount of "+billionaire[i]);
            money[i]= scanner.nextInt();
            i++;

        }
        System.out.printf("%-15s%-12s%-11s%-15s%-11s%-13s%-13s","Tên","mắc-xoăn","bin-gết","trịnh-văn-mút","rách-ma","dép-b-dốt","s-típ-dóp");
        System.out.printf("\n%s%10s", "Amount: "," ");
        for(int j= 0; j<money.length;j++){
            System.out.print(money[j]+"tỷ $"+ "    \t");
        }
        int max= money[0];
        for(int k= 1; k<money.length; k++){
            if(money[k]>max){
                max= money[k];
                index= k;
            }
        }
        System.out.println("\n"+billionaire[index]+ " is the richest person in the array with an amount of "+ max+" billion $");
    }
}
