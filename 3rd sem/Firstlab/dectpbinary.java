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
public class dectpbinary {
    
    public static void main (String args[])
    { int a=0;
    int c;
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter the number");
        int n=sc.nextInt();
        int y=n;
    int length=0;
     while(n!=0)
     {
      n=n/2;
      //c=a;
        length++;
       
     }
         int b[]=new int[length];
         for (int i=0;i<length;i++)
         {  a=y%2;
         y=y/2;
         b[i]=a;
         
             
         }

    }
  
    
}

