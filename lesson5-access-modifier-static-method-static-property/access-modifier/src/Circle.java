public class Circle {
    private double radius= 1.0;
    private String color = "red";
    void Circle(){

    }
    public Circle(double radius){
        this.radius= radius;
    }
    public double getRadius(){
        return radius ;
    }
    public double getArea(){
        double Area = 3.14*this.radius;
        return Area;
    }

}
