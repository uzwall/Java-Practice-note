package Complexx;
//Create a base class complex with member variables real and imaginary with constructor to
//        initialize values of real and imaginary. Also include the member method called display to
//        display the values of complex number.
//        Create a child class complex1 with member variables real and imaginary and member
//        method add which adds it’s real with parents real and it’s imaginary with parents imaginary
//        and return the result as a complex type. Also include constructor that initializes it’s
//        member variable values.
//        Create an object of complex1 and call the add method on behalf of it to print the result.
class Complex {
    int real;
    int image;
    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }
    public void display() {
        System.out.println(real + " + " + image + "i");
    }
}

class Complex1 extends Complex {

    int real;
    int image;

    public Complex1(int r, int i, int real, int image) {
        super(r, i);
        this.real = real;
        this.image = image;

   }

    public Complex add() {
        return new Complex(super.real + real, super.image + image);
    }
}

public class RealAndImaginary {
    public static void main(String[] args) {
        Complex1 c = new Complex1(4, 5, 6, 7);
        Complex U = c.add();
        U.display();
    }
}
