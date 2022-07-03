import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the weight:");
        float weight= scanner.nextFloat();
        System.out.println("Enter the height:");
        float height= scanner.nextFloat();
        float bmi = weight/ (height*height);
        if(bmi<18.5){
            System.out.println("Underweight");
        } else {
            if(bmi < 25.0){
                System.out.println("Normal");
            }else {
                if(bmi< 30.0){
                    System.out.println("Overweight");
                } else System.out.println("Obese");
            }
        }
    }
}
