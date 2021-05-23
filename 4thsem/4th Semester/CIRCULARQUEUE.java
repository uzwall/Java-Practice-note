class Circular_Queue {
    public int front, rear;
    public int size = 5;
    public int item[] = new int[size];

    Circular_Queue() {
        front = -1;
        rear = -1;
    }

    public void enqueue(int data) {
        if ((rear + 1) % size == front) {
            System.out.println("Over flow");

        } else if (front == -1 && rear == -1) {
            front = rear = 0;
            item[rear] = data;

        } else {
            rear = (rear + 1) % size;
            item[rear] = data;
        }
    }

    public void dequeue() {
        if (front == -1 && rear == -1) {
            System.out.println("Under flow:");
        } else if (front == rear) {
            System.out.println("Deleted item:" + item[front]);
            front = -1;
            rear = -1;
        } else {
            System.out.println("Deleted item:" + item[front]);
            front = (front + 1) % size;
        }
    }

    public void traverse() {
        int i=front;
        if (front == -1 && rear == -1) {
            System.out.println("\nQueue is Empty");
            
        }
        else {
            while(i!=rear){
                System.out.println(item[i]);
                i=(i+1)%size;
            }
            System.out.println(item[i]);
        }
       
        }
        // int i = front;
        // if (front == -1 && rear == -1) {
        // System.out.println("EMpty");
        // } else {
        // while (i <= rear) {
        // System.out.println(item[i]);
        // i = (i + 1) % size;
        // }
        // }

        // }

    }


public class CIRCULARQUEUE {
    public static void main(String[] args) {

        Circular_Queue c = new Circular_Queue();
        c.enqueue(9);
        c.enqueue(7);
        c.enqueue(2);
        c.enqueue(78);
        c.enqueue(8);
        c.dequeue();
        c.traverse();

    }
}
