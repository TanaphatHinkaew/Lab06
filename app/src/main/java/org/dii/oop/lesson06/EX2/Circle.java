package app.src.main.java.org.dii.oop.lesson06.EX2;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle", 0);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 6.283185307179586 * this.radius;
    }
}


