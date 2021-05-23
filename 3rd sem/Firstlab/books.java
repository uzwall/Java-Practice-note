/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Firstlab;

class Publication {

    private String name = "Kriti publication";
    protected String date = "1999";

    public void print() {
        System.out.print(name + " " + date);
    }
}

class Book extends Publication {

    String name = "Java";
    protected int price = 1000;

    public void print() {
        super.print();
        System.out.print(name + " " + price);
    }
}

class Tape extends Publication {

    String name;
    int time;

    public void print() {
        super.print();
        System.out.print(name + " " + time);
    }

}

public class books {

    public static void main(String[] args) {
        Book obj = new Book();
        Tape ob1=new Tape();
        obj.print();
        ob1.print();
    }

}
