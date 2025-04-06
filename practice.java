import java.util.*;
public class practice {
    public static class Node {
        int data;
        Node next;
        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

    public void add_at_frist(int x) {
        Node q = new Node(x);
        if (head == null) { // Corner case (if linked list is empty)
            head = q;
            tail = q; // Update tail when list is empty
            return;
        }
        q.next = head;
        head = q;
    }

    public void print() {
        Node q = head;
        while (q != null) {
            System.out.print(q.data + "->");
            q = q.next;
        }
        System.out.print("Null");
    }

    public void add_at_end(int x) {
        Node q = new Node(x);
        if (head == null) { // Corner case (if linked list is empty)
            head = q;
            tail = q; // Update head and tail when list is empty
            return;
        }
        Node p = head;
        while (p.next != null) {
            p = p.next;
        }
        p.next = q;
        tail = q; // Update tail
    }

    public static Node head;
    public static Node tail;

    public static void main(String[] args) {
        practice p = new practice();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the linked list: ");
        int size = s.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            int x = s.nextInt();
            p.add_at_frist(x);
        }
        System.out.println("");
        System.out.print("The linked list is: ");
        p.print();
    }
}