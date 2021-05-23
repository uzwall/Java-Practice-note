class Link {
    public int data;
   public Link prev, next;
}

class DoubleLink {
    Link head, tail;

    public void insert(int data) {
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

    public void insertatfirst(int data) {
        Link node = new Link();
        node.data = data;
        node.next = head;
        head.prev = node;
        node.prev = null;
        head = node;

    }

    public void insertat(int index, int data) {
        Link node = new Link();
        node.data = data;
        if (index == 0) {
            insertatfirst(data);
        } else {
            Link temp = head;
            Link temp1;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp1 = temp.next;
            node.prev = temp;
            node.next = temp1;
            temp.next = node;
            temp1.prev = node;
        }

    }

    public void delete(int index) {
        if (index == 0) {
            head = head.next;
            head.prev = null;
        } else {
            Link temp = head;
            Link temp1, temp2;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }

            temp1 = temp.prev;
            temp2 = temp.next;
            temp1.next = temp2;
            temp2.prev = temp1;
            temp = null;
        }
    }

    public void display() {
        Link temp = head;
        while (temp.next != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(tail.data);

    }
}

public class DoubleLinkedList {
    public static void main(String[] args) {
        DoubleLink L = new DoubleLink();
        L.insert(5);
        L.insert(7);
        L.insertatfirst(9);
        L.insert(6);
        L.insertat(3, 17);
        L.delete(2);
        L.display();
    }

}
