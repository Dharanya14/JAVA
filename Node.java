import java.util.*;

class Node {
    int data;
    Node next, h, t;

    Node(int d) {
        data = d;
        next = null;
    }

    void insert(int d) {
        Node newN = new Node(d);
        if (h == null) {
            h = newN;
            t = h;
        } else {
            t.next = newN;
            t = t.next;
        }
    }

    void display(Node h) {
        Node temp = h;
        while (temp != null) {
            System.out.print(" " + temp.data + " | " + temp.next);
            if (temp.next != null) {
                System.out.print("--->");
            }
            temp = temp.next;
        }
    }

    void insertRandom(int d, int n) {
        Node newN = new Node(d);
        if (n == 0) { 
            newN.next = h;
            h = newN;
            if (t == null) {
                t = h;
            }
            return;
        }
        Node temp = h;
        for (int i = 0; i < n - 1; i++) {
            if (temp == null) {
                System.out.println("Invalid position");
                return;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }
        newN.next = temp.next;
        temp.next = newN;
        if (newN.next == null) {
            t = newN;
        }
    }

    public static void main(String args[]) {
        Node m = new Node(0);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        while (a != -1) {
            m.insert(a);
            a = sc.nextInt();
        }
        System.out.println("Enter the number to insert:");
        int num = sc.nextInt();
        System.out.println("Enter the position to insert:");
        int pos = sc.nextInt();
        m.insertRandom(num, pos);
        m.display(m.h);
        sc.close();
    }
}