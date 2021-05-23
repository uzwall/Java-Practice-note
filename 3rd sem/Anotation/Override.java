package Anotation;

public class Override {

    static class Animal {
        void eatSomething() {
            System.out.println( "parents");
        }
    }

    class Dog extends Animal {

      void eatSomething() {
            System.out.println( "child");

        }


        }// should be eatSomething

    public static void main(String args[]) {

     Animal a =new Animal();
        a.eatSomething();

    }
}

    class TestAnnotation1 {

    }



