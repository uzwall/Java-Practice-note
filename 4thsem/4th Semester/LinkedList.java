class link {
    int data;
    link next;
    
}

class SingleLinkedlist {
    link head;

    public void insert(int data) {
        link node = new link();
        node.data = data;
        if (head == null) {
            head = node;
        } else {
            link temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }

    }

    public void insertatfirst(int data) {
        link node = new link();
        node.data = data;
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }

    }

    public void insert(int index, int data) {
        link node = new link();
        node.data = data;
        link temp = head;
        if (index == 0) {
            insertatfirst(data);
        } else {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }

    }

    public void deleteat(int index) {
        if (index == 0) {
            head = head.next;

        } else {
            link temp = head;
            link temp1;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp1 = temp.next;
            temp.next = temp1.next;
        }

    }

    public void display() {
        link temp = head;
        while (temp.next != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

}

public class LinkedList {
    public static void main(String[] args) {
        SingleLinkedlist L = new SingleLinkedlist();
        L.insert(4);
        L.insert(5);
        L.insertatfirst(6);
        L.insert(2, 9);
        L.insert(0, 8);
        L.deleteat(2);
        L.display();

    }
}
