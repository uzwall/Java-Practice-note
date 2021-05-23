
package Firstlab;

class Multi {

    int Mult(int i, int j) {
        int x = 0;
        if (j == 0) {
            return 1;

        }
        return i + Mult(i, j - 1);

    }
}
public class Multiply {
    
public static void main(String[] args){
    Multi m=new Multi();
   System.out.print("the power");
   m.Mult(2, 3);
}
}

