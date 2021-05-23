package Question;

import java.io.*;
import java.util.Scanner;


class Employee implements Serializable {
    String name;
    int age;
    String address;

    public Employee(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}

public class WriteAndReadObjectFIle {
    public static void main(String[] args) {

        try {
            FileOutputStream f2 = new FileOutputStream("C:\\uzzwal\\object.txt");
            ObjectOutputStream o2 = new ObjectOutputStream(f2);
            Employee e = new Employee("Ujjwal", 19, "Swyambhu");
            o2.writeObject(e);

            FileInputStream f1 = new FileInputStream("C:\\uzzwal\\object.txt");
            ObjectInputStream o1 = new ObjectInputStream(f1);

            Employee i = (Employee) o1.readObject();
            System.out.println(i);
            f1.close();
            f2.close();
            o1.close();
            o2.close();
        } catch (Exception e) {
            System.out.println(e);

        }
    }
}
