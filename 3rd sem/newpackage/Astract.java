/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

abstract class Shape {

    abstract double getArea();

}

class Rectangle extends Shape {

    double b;
    double l;

    public Rectangle(double l, double b) {
        this.b = b;
        this.l = l;

    }

    double getArea() {

        return l * b;
    }

}

class Circle extends Shape {

    final double pi = 3.14;
    double r;

    public Circle(double r) {
        this.r = r;

    }

    double getArea() {

        return pi * r * r;
    }

}

class Square extends Shape {

    double l;

    public Square(double length) {
        this.l = length;

    }

    double getArea() {
        return l * l;
    }

}

public class Astract {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Circle");
        System.out.println("2.Rectangle");
        System.out.println("3.Square");

        Shape a[] = new Shape[3];
        System.out.print("Enter the number to find the area above:");
        for (int i = 0; i < 3; i++) {
            int n = sc.nextInt();
            switch (n) {
                case 1: {
                    System.out.print("enter the radius");
                    a[i] = new Circle(sc.nextDouble());
                    System.out.print("The area of Circle is" + a[i].getArea());
                    break;
                }
                case 2: {
                    System.out.print("enter the length and breadth of rectangle");
                    a[i] = new Rectangle(sc.nextDouble(), sc.nextDouble());
                    System.out.print("The area of Rectangle is" + a[i].getArea());
                    break;
                }
                case 3: {
                    System.out.print("Enter the length");
                    a[i] = new Square(sc.nextDouble());
                    System.out.print("The area of Square is " + a[i].getArea());
                }
            }
        }

    }
}
