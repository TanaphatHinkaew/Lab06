package app.src.main.java.org.dii.oop.lesson06.EX2;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

class CustomArrayList extends ArrayList<Shape> {
    CustomArrayList() {
    }

    public void listAllShapes() {
        Iterator var1 = this.iterator();

        while(var1.hasNext()) {
            Shape shape = (Shape)var1.next();
            PrintStream var10000 = System.out;
            String var10001 = shape.getName();
            var10000.println("Shape: " + var10001 + "   Area: " + shape.getArea() + "   Perimeter: " + shape.getPerimeter());
        }

    }

    public void sumArea() {
        double sum = 0.0;

        Shape shape;
        for(Iterator var3 = this.iterator(); var3.hasNext(); sum += shape.getArea()) {
            shape = (Shape)var3.next();
        }

        System.out.println("Summation of area: " + sum);
    }
}

