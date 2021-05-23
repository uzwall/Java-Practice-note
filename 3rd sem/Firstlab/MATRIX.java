/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Firstlab;
        import java.util.Scanner;
public class MATRIX {
    
    public static void main (String args[])
    { int a;
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter the number");
        int n=sc.nextInt();
     int length=0;
        while (0!=n)
        {
           length++;
           
            
        }
        int decimal=0;
        for (int i=0;i<length;i++)
        {
            a=n%10;
            n=n/10;
            decimal= decimal +a* (2^i);
            
        }
        System.out.println(decimal);
    }
}
