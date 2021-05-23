/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Firstlab;

/**
 *
 * @author KIST
 */
import java.util.Scanner;

public class Prime {

    public static void main(String args[]) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i;
        int count = 0;
        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
