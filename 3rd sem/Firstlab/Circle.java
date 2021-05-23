package Firstlab;


import java.util.Scanner;

class Area {
    static final double PI = 3.14;
    static double radius;

    Area(double radius) {
        Area.radius = radius;
        System.out.println("Area of circle is " + (PI * radius * radius));
    }
}

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        Area obj = new Area(sc.nextInt());
    }
}
