package app.src.main.java.org.dii.oop.lesson06.EX2;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Scanner;

public class Lesson {
    public Lesson() {
    }

    public static void run() {
        CustomArrayList shapes = new CustomArrayList();
        new ArrayList();
        Scanner in = new Scanner(System.in);

        String choice;
        do {
            System.out.print("1. Circle\n2. Rectangle\n3. Square\n4. Display all shape\n5. Show summation of area\n6. exit\nPlease select [1-6]:  ");
            choice = in.nextLine().trim();
            String strSide;
            double side;
            if ("1".equals(choice)) {
                System.out.print("Enter radius: ");
                strSide = in.nextLine();
                side = Double.parseDouble(strSide);
                Circle circle = new Circle(side);
                shapes.add(circle);
            }

            if ("2".equals(choice)) {
                System.out.print("Enter width: ");
                strSide = in.nextLine();
                side = Double.parseDouble(strSide);
                System.out.print("Enter height: ");
                String strHeight = in.nextLine();
                double height = Double.parseDouble(strHeight);
                Rectangle rectangle = new Rectangle(side, height);
                shapes.add(rectangle);
            }

            if ("3".equals(choice)) {
                System.out.print("Enter side: ");
                strSide = in.nextLine();
                side = Double.parseDouble(strSide);
                Square square = new Square(side);
                shapes.add(square);
            }

            if ("4".equals(choice)) {
                System.out.println("List all shape: ");
                shapes.listAllShapes();
            }

            if ("5".equals(choice)) {
                shapes.sumArea();
            }
        } while(!"6".equals(choice));

        in.close();
    }
}
