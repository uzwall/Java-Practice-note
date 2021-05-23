/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringHandling;

import java.util.Scanner;

/**
 *
 * @author UZWAL
 */
public class ListNameInAscending {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a[] = new String[10];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter the " + (i + 1) + "st " + "name: ");
            a[i] = sc.next();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length ; j++) {
                int var = a[i].compareTo(a[j]);
                System.out.println(var);
                if (var > 0) {
                    String temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    
                }

            }
        }
            for (int i=0;i<a.length;i++) {
                System.out.println(a[i]);
            }

    }

}
