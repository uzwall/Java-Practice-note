import java.util.Scanner;

class Node {
    public int info;
    public Node left;
    public Node right;

}

class Bst {
    public Node root;

    public void insert(int data) {
        Node newnode = new Node();
        newnode.info = data;
        Node temp = new Node();
        Node Newtemp = new Node();

        if (root == null) {
            root = newnode;
        } else {
            temp = root;
            while (temp != null) {
                Newtemp = temp;

                if (data < temp.info) {
                    temp = temp.left;
                } else {
                    temp = temp.right;
                }
            }
            if (data < Newtemp.info) {
                Newtemp.left = newnode;
            } else {
                Newtemp.right = newnode;
            }
        }
    }

    // Inorder traversal
    public void Inorder(Node x) {
        if (x != null) {
            Inorder(x.left);
            System.out.println(" " + x.info);
            Inorder(x.right);
        }

    }

    // Preorder Traversal
    public void Preorder(Node x) {
        if (x != null) {
            System.out.println(" " + x.info);
            Preorder(x.left);
            Preorder(x.right);

        }
    }

    public void Postorder(Node x) {
        if (x != null) {

            Postorder(x.left);
            Postorder(x.right);
            System.out.println(" " + x.info);

        }
    }

}

public class BinarySearchTree {
    public static void main(String[] args) {
        Bst D = new Bst();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the option: ");
            System.out.println("1.Insert");
            System.out.println("2.Inorder");
            System.out.println("3.Preorder");
            System.out.println("4.Postorder");
            System.out.println("5.Exit");
            int choice = sc.nextInt();
            switch (choice) {

            case 1:
                System.out.println("Enter Node :");
                D.insert(sc.nextInt());
                break;
            case 2:
                D.Inorder(D.root);
                break;
            case 3:
                D.Preorder(D.root);
                break;
            case 4:
                D.Postorder(D.root);
                break;
            case 5:
                sc.close();
                System.exit(0);
            default:
                System.out.println("Invalid Option!!!");
                break;
            }
        }

    }
}
