package fourthsem;

import java.util.Scanner;

import static java.lang.System.exit;

public class SimpleLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linkedlist t1 = new Linkedlist();
        while(true) {
           System.out.println("Enter choice:");
           System.out.println("1.insert");
           System.out.println("2.insert at start");
           System.out.println("3.display");
           System.out.println("4.exit");
           int ch =sc.nextInt();
           switch (ch){
               case 1:{
                   System.out.println("Enter data ");
                   int data = sc.nextInt();
                   t1.insert(data);
                   break;
               }
               case 2:{
                   System.out.println("Enter data ");
                   int data = sc.nextInt();
                   t1.insertatStart(data);
                   break;
               }
               case 3:{
                   t1.display();
                   break;
               }
               case 4:{
                   exit(0);
               }
               default: {
                   System.out.println("Invalid Choice");
                   break;
               }

           }
        }


    }
}


class Linkedlist{
    Node head , tail;
    public void  insert(int data){
        Node NewData = new Node();
        NewData.data=data;
        if (head==null){
            head=tail=NewData;

        }
        else {
            tail.next=NewData;
            tail=NewData;
        }
    }
    public void  insertatStart(int data){
        Node NewData = new Node();
        NewData.data=data;
        if (head==null){
            head=tail=NewData;

        }
        else {
            NewData.next=head;
            head=NewData;
        }

    }
    public void display() {
        Node n = head;
        if (head == null) {
            System.out.println("empty");
        } else {
            while (n != null) {
                System.out.println(n.data);
                n = n.next;
            }
        }
    }
    public void deletefirst(){
        if (head == null) {
            System.out.println("empty");
        } else{
            System.out.println("deleted data  "+ head.data);
            head=head.next;
        }

    }
    public void deletelast(){
        if (head == null) {
            System.out.println("empty");
        } else {
            System.out.println("deleted data  "+ tail.data);
            Node n =head;
            while (n!= tail) {
                n=n.next;
            }
            tail = n;


        }
        }
    public void delete(int position){
        if (head == null) {
            System.out.println("empty");
        } else{
           Node n = head;
           for (int i=0; i< position -1;i++){
               n = n.next;
           }
           Node o= n.next;
           System.out.println("Deleted item: "+ o.data);
           n.next=o.next;
        }
    }
}