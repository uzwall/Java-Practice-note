class CircularLinked {
    Link head, tail;

    public void enqueue(int data) {
        Link node = new Link();
        node.data = data;
        if (head == null) {
            head = tail = node;

        }

        else {
            tail.next = node;
            tail = node;
            tail.next = head;

        }
    }

    public void denqueue() {
        if (head == null) {
            System.out.println("Queue is Empty:");
        } else if (head == tail) {
            System.out.println("Deleted item: " + head.data);
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
    }

    public void display() {
        Link temp = head;

        while (temp.next != head) {
            System.out.println(temp.data);
            temp = temp.next;

        }
        System.out.println(temp.data);
    }

}

public class CircularLinkedList {
    public static void main(String[] args) {
        CircularLinked C = new CircularLinked();
        C.enqueue(7);
        C.enqueue(2);
        C.enqueue(5);
        C.enqueue(8);
        C.denqueue();
        C.display();
    }
}
