package newpackage;

import java.util.Scanner;

class Book {

    String name;
    int price;

    public Book getCostlyBook(Book obj[]) {
        Book costlybook = obj[0];

        for (int j = 1; j < 4; j++) {

            if (costlybook.price < obj[j].price) {
                costlybook = obj[j];
            }
        }

        return costlybook;

    }
}

public class PrintouttheBookDetail {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book a[] = new Book[4];
        for (int i = 0; i < a.length; i++) {
            a[i]=new Book();
            System.out.println("enter the book name");
            a[i].name = sc.next();
            System.out.println("enter the price of book");
            a[i].price = sc.nextInt();

        }
        Book obj = new Book();

Book obj1 = new Book();
obj1=obj.getCostlyBook(a);
System.out.print(obj1.name);
System.out.print(obj1.price);


    }

}
