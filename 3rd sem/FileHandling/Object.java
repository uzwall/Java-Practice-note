package FileHandling;

import java.io.*;

class Person implements Serializable {
    int id;
    String name;
    int age;

    Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Person info:\n Name:" + this.name + " age" + this.age + " id:" + this.id;
    }
}

public class Object {
    public static void main(String[] args) {
        try {
            FileOutputStream f = new FileOutputStream("C:\\uzzwal\\object.txt");
            ObjectOutputStream oos = new ObjectOutputStream(f);
//            Person p[]=new Person(1,Ujjwal,20);
//            oos.writeObject();
            Person p = new Person(1, "Prashant", 19);
            oos.writeObject(p);
            oos.close();
            FileInputStream f1 = new FileInputStream("c:\\uzzwal\\object.txt");
            ObjectInputStream oi = new ObjectInputStream(f1);
            Person p1 = (Person) oi.readObject();
            System.out.println(p);
        } catch (Exception e) {

        }
    }
}
