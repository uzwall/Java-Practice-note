package newpackage;

class A {

    int x = 10;

    A() {
        System.out.println("Constructor in A");
    }

    void met1() {
        System.out.println("met1 in A");
    }

    void met2() {
        System.out.println("met2 in A");
    }
}

class B extends A {

    int x = 20;

    B() {
        System.out.println("Constructor in B");
    }

    void met1() {
        System.out.println("met1 in B");
    }

    void met2() {
        System.out.println("met3 in B");
    }
}

public class Constructor {

    public static void main(String args[]) {
        A m = new B();
        System.out.println(m.x);
        m.met1();
        m.met2();
       
    }

}
