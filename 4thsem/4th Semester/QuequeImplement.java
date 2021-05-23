class Queue {
    public int front, rear;

    public Queue() {
        front = 0;
        rear = -1;
    }

    int size = 5;
    public int item[] = new int[size];

    boolean isfull() {
        return rear == size - 1;
    }

    boolean isempty() {
        return front == size - 1;
    }

    public void enqueue(int data) {

        if (!isfull()) {
            rear++;
            item[rear] = data;

        } else {
            System.out.println("Over flow:");
        }
    }

    public void dequeue() {
        if (!isempty()) {
            System.out.println("Deleted item:" + item[front]);
            front++;
        } else {
            System.out.println("Under flow:");
        }

    }

    public void Display() {
        for (int i = front; i <= rear; i++) {
            System.out.println(item[i]);
        }
    }
}

public class QuequeImplement {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(9);
        q.enqueue(3);
        q.enqueue(7);
        q.enqueue(8);
        q.dequeue();
        q.Display();
    }

}