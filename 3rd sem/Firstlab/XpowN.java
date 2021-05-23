/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Firstlab;

class Mul {

    int power(int i, int j) {
        int x = 0;
        if (j == 0) {
            return 1;

        }
        return i * power(i, j - 1);

    }
}

public class XpowN {

    public static void main(String[] args) {

        Mul obj = new Mul();
        int z = obj.power(2, 4);
        System.out.print("the power is" + z);

    }
}
