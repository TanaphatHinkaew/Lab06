package app.src.main.java.org.dii.oop.lesson06.EX1;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super("Rectangle", 4);
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2.0 * (this.width + this.height);
    }
}
