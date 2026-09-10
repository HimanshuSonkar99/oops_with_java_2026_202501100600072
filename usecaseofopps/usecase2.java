// package usecaseofopps;
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

abstract class Shape {
    abstract double area();
    abstract void displayArea();
}

class Circle extends Shape {
    private double radius;
    Circle(double r) {
        this.radius = r;
    }
    double area(){
        return Math.PI * radius * radius;
    }
    void displayArea(){
        System.out.println("Area = " + Math.PI * radius * radius);
    }
}
class Rectangle extends Shape{
    private double l,b;
    Rectangle(double l,double b){
        this.l=l;
        this.b = b;
    }
    double area(){
        return l*b;
    }
    void displayArea(){
        System.out.println("Area =  " + l*b);
    }
}

