/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threa;

/**
 *
 * @author UZWAL
 */

class Threadtest extends Thread{
    public void run(){
        for (int i=0;i<10;i++){
            try{
                System.out.print(i);
                Thread.sleep(500);
                
            }
            catch(Exception ex){
                System.out.print(ex);
            }
        }
    }
}
class Threadtest1 extends Thread{
    public void run(){
        for (int i=0;i<10;i++){
            try{
                System.out.print(i);
                Thread.sleep(500);
                
            }
            catch(Exception e){
                System.out.print(e);
            }
        }
    }
}
public class THreds {
    
    public static void main(String[] args){
        try{
            Threadtest obj= new Threadtest();
            Threadtest ob2= new Threadtest();
            obj.start();
            ob2.start();
           
            System.out.print("thread is alive:"+obj.isAlive());
            System.out.print("thread is alive:"+ob2.isAlive());
            obj.join();
            System.out.print("thread is:"+obj.isAlive());
            System.out.print("threadrest is alve:"+obj);
            
            
        }
        catch(Exception ex){
            
        }
    }
    
    
}
