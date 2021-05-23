package fourthsem;

public class LinkedListCircularQueque {
    public static void main(String[] args) {
        CircularQueque t1 = new CircularQueque();
        t1.cirenqueque(1);
        t1.cirenqueque(2);
        t1.cirenqueque(3);
        t1.cirenqueque(4);
        t1.display();
        t1.cirdenqueque();
        t1.cirdenqueque();
        t1.cirdenqueque();
        t1.cirdenqueque();

        t1.display();
    }
}


class CircularQueque{  //node class is in another files since both these files are in same package we can also access its classes
 Node front , rear;
 public void cirenqueque(int data){
      Node NewData= new Node();
      NewData.data=data;
      NewData.next=null;

      if (front == null && rear == null){
           front =  NewData;
           rear = NewData;

     }
      else {
           rear.next = NewData;
           rear = NewData;
           rear.next= front;
      }
 }

 public void display() {
     Node n = front;
     if (front == null) {
         System.out.println("empty");

     } else {
         while (n != rear) {
             System.out.println(n.data);
             n = n.next;

         }
         System.out.println(n.data);

     }
 }
 public void cirdenqueque() {
     if (front == null){
         System.out.println("empty");
     }
       else   if (front == rear) {
             System.out.println("Deleted item  " + front.data);
             front = rear = null;


         } else {
             System.out.println("Deleted item  " + front.data);
             rear.next = front.next;
             front = front.next;

         }

     }



 }
