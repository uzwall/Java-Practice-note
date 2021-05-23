package Wrapper;
class Myinteger
{
    int a;
    Myinteger(int a)
    {
        this.a=a;

    }
    int intVal()
    {
        return this.a;
    }
}

class Swap {


    static void Change(Myinteger a, Myinteger b) {
        int temp = a.a;
        a.a = b.a;
        b.a = temp;


    }

}

public class WrapperSwap {
    public static void main(String[] args) {

//        int a=5;
//        int b=6;
        Myinteger a = new Myinteger(5);
        Myinteger b = new Myinteger(6);
        Swap.Change(a, b);
        System.out.println(a.intVal() + " " + b.intVal());

    }
}
