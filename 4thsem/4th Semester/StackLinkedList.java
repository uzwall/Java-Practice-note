class StackLinked {
    Link head, tail;

    public void push(int data) {
        Link node = new Link();
        node.data = data;
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    public void pop() {
        tail = tail.prev;
        tail.next = null;
    }

    public void traverse() {
        Link temp = tail;
        while (temp.prev != null) {

            System.out.println(temp.data);
            temp = temp.prev;
        }
        System.out.println(temp.data);
    }

}

public class StackLinkedList {
    public static void main(String[] args) {
        StackLinked L = new StackLinked();
        L.push(5);
        L.push(4);
        L.push(7);
        L.pop();
        L.traverse();
    }

}
