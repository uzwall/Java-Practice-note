/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Firstlab;
import java.util.Scanner;
/**
 *
 * @author KIST
 */
public class Factorial {
    public static void main(String args[])
    {Scanner sc=new Scanner (System.in);
        System.out.print("Enter the number");
        int a=sc.nextInt();
        int fact=1;
        for(int i=1;i<=a;i++)
        {
            fact=fact *i;
            
        }
        System.out.println(fact);
        
    }
    
}
