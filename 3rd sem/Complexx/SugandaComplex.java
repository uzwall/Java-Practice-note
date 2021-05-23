package Complexx;
class complex {

    int real;
    int imaginary;
    complex(int real , int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    void display(){
        System.out.println(real+" + "+imaginary+ "i");
    }


}
class complex1 extends complex{

    int real;
    int imaginary;

    public complex1(int r,int i,int real, int imaginary) {
        super(r, i);
        this.real = real;
        this.imaginary = imaginary;
    }
    complex add(){
        int a =real+super.real;
        int b =imaginary+super.imaginary;

        return new complex(a,b);

    }


}
class demo{
    public static void main(String args[]){
        complex1 obj = new complex1(1,2,2,3);
        complex a = obj.add();
        a.display();
        System.out.println(a);

    }
}
public class SugandaComplex {
}
