package SelfLearned;


public class AbstractClassWithConstructor {
    public static void main(String args[]) {
        A a = new A();
        A b = new B(); // object of type B
        A c = new C();

        // Data member of class A will be accessed
        System.out.println(a.x);
        a.run();
        System.out.println(b.x);
        b.run();
        System.out.println(c.x);
        c.run();
    }
}

class A {
    int x = 10;

    void run() {
        System.out.println("A");
    }
}


class B extends A {

    int x = 20;

    void run() {
        System.out.print("B");
    }
}

class C extends B {
    int x = 30;

    void run() {
        System.out.print("C");
    }
}

