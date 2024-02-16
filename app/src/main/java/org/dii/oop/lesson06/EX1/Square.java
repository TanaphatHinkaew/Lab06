package app.src.main.java.org.dii.oop.lesson06.EX1;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


public class Square extends Shape {
    private double side;

    public Square(double side) {
        super("Square", 4);
        this.side = side;
    }

    public double getArea() {
        return this.side * this.side;
    }

    public double getPerimeter() {
        return 2.0 * (this.side + this.side);
    }
}
