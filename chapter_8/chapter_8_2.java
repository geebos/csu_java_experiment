/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_8;

public class chapter_8_2 {
    public static void main(String args[]) {
        Shape shapes[] = new Shape[3];
        shapes[0] = new Triangle(10, 20);
        shapes[1] = new Circle(20);
        shapes[2] = new Rectangle(10, 20);

        System.out.printf("the Triangle area is: %4.2f\n", shapes[0].get_area());
        System.out.printf("the Circle area is: %4.2f\n", shapes[1].get_area());
        System.out.printf("the Rectangle area is: %4.2f\n", shapes[2].get_area());
    }
}

abstract class Shape {
    public abstract double get_area();
}

class Triangle extends Shape{
    private double w, h;

    Triangle(double w, double h){
        this.w = w;
        this.h = h;
    }

    public double get_area(){
        return 0.5 * w * h;
    }
}

class Circle extends Shape{
    private double r;
    private final double PI = 3.142592654;

    Circle(double r){
        this.r = r;
    }

    public double get_area(){
        return PI * r * r;
    }
}

class Rectangle extends Shape{
    private double width;
    private double height;

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double get_area(){
        return width * height;
    }
}
