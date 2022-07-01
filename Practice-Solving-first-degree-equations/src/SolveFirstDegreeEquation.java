import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SolveFirstDegreeEquation {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextFloat();
        System.out.println("b: ");
        double b = scanner.nextFloat();
        System.out.println("c: ");
        double c = scanner.nextFloat();
        if(a!=0){
            double answer= (c-b)/a;
            System.out.printf(" Equation pass with x= %f!\n" ,answer);
        } else {
            if(b==c){
                System.out.println("The solution is all x!");
            } else {
                System.out.println("No solution!");
            }
        }
    }
}
