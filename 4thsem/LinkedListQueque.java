package fourthsem;
 class Node{
    public int data;
    public Node next;
}
public class LinkedListQueque {
    public static void main(String[] args) {
        Queque t1 = new Queque();
        t1.enqueque(3);
        t1.enqueque(4);
        t1.enqueque(5);
        t1.enqueque(6);
        t1.show();
        t1.denqueque();
        t1.show();




    }
}

class Queque {
    public Node front, rear;

    public void enqueque(int data) {
        Node NewData = new Node();
        NewData.data = data;
        NewData.next = null;
        if (front == null && rear == null) {
            front = NewData;
            rear = NewData;
        } else {
            rear.next = NewData;
            rear = NewData;
        }

    }

    public void show() {
        Node n = front;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;

        }
    }

    public void denqueque() {
        if (front == null) {
            System.out.print("EMpty");
        } else {

                System.out.println("Deleted item" + front.data);
                front = front.next;

        }
    }
}
