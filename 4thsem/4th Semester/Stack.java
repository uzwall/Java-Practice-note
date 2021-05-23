import java.util.Scanner;

class Simple_Stack {
    public int tos = -1;
    public int size = 5;
    public int ar[] = new int[size];

    boolean isfull() {

        return tos == size - 1;
    }

    boolean isempty() {
        System.out.println("The Size is empty or Underflow");
        return tos == -1;
    }

    public void push(int data) {
        if (!isfull()) {
            tos++;
            ar[tos] = data;

        } else {
            System.out.println("The Size of Stack is full or Overflow");
        }

    }

    public void pop() {
        if (!isempty()) {
            int temp = ar[tos];
            System.out.println("Deleted Item:" + temp);
            tos--;

        } else {
            System.out.println("Empty");

        }
    }

    public void traverse() {
        if (tos == -1) {
            System.out.println("Empty");
        } else {
            for (int i = tos; i >= 0; i--) {
                System.out.println(ar[i]);
            }
        }
    }
}

public class Stack {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Simple_Stack S = new Simple_Stack();
        while (true) {
            System.out.println("Enter the option:");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Display or Traverse");
            System.out.println("4.exit");
            int choice = Sc.nextInt();

            switch (choice) {
            case 1:
                System.out.println("Enter the data you want to push: ");
                int d = Sc.nextInt();
                S.push(d);
                break;

            case 2:
                S.pop();
                break;

            case 3:
                S.traverse();
                break;

            case 4:
                Sc.close();
                System.exit(0);

            default:
                System.out.println("Invalid Option");
                break;

            }

        }
    }
}