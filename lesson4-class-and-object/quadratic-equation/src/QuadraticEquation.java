import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a= ");
        double a= scanner.nextDouble();
        System.out.print("Enter b= ");
        double b= scanner.nextDouble();
        System.out.print("Enter c= ");
        double c= scanner.nextDouble();
        QuadraticEquation demo = new QuadraticEquation(a,b,c);
        System.out.println("Giải phương trình "+a+"x^2"+"+"+ demo.getb()+"x"+ "+"+demo.getc()+ "= 0");
        if(a==0){
            if(b==0){
                System.out.println("No solution!");
            }else {
                System.out.println("x = "+ (-c/b));
            }
        } else {
            if(demo.getDiscriminant()==0){
                System.out.println("x1= x2= "+ demo.getRoot1());
            }else {
                if(demo.getDiscriminant()>0){
                    System.out.println("x1= "+ demo.getRoot1());
                    System.out.println("x2= "+ demo.getRoot2());
                } else {
                    System.out.println(" The equation has no roots");
                }
            }
        }
    }
    private double a,b,c;
    private QuadraticEquation(double a, double b, double c){
        this.a= a;
        this.b = b;
        this.c = c;
    }
    private double geta(){
        return this.a;
    }
    private double getb(){
        return this.b;
    }
    private double getc(){
        return this.c;
    }
    private double getDiscriminant(){
        double delta;
        return delta= this.b*2- 4*this.a*this.c;
    }
    private double getRoot1(){
        double r1;
        return r1= (-this.b+ Math.sqrt(this.b*this.b-4*this.a*this.c))/(2*this.a);
    }
    private double getRoot2(){
        double r2;
        return r2= (-this.b- Math.sqrt(this.b*this.b-4*this.a*this.c))/(2*this.a);
    }
}
