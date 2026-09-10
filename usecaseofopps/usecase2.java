package javaProgramming.usecaseofopps.usecase2.java;
public class usecase2 {
     public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
 
        for (Shape s : shapes) {
            s.displayArea();   // must print correct area for each shape
        }
    }
}

abstract class Area{
    abstract void displayArea();
}
class Circle{
    double r;
    Circle(double r){
        this.r = r;
    }
    public double area(){
        return 3.14 * r * r;
    }
    public void displayArea(){
        System.out.println("Area of Circle: " + area());
    }
}