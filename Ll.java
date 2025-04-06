import java.util.*;

public class Ll {
    public static class Node {
        int data;
        Node next;// coz next point kar se ek node ne j already object che node class no

        Node(int data)// step 2
        {
            this.data = data;
            this.next = null;
        }
    }

    // *********************Adding a node at first position of linkedlist
    public void add(int x) {
        Node new_node = new Node(x);// creating the new node step 1
        size++;
        // if the given node is empty
        if (head == null) {
            head = tail = new_node;
            return;
        }
        new_node.next = head;// step 3
        head = new_node;// step 4
    }

    // ********************************Adding a node at given index in the linedlist
    public void add(int x, int index) {
        // we can use both while and for loop to perform this . But we prefer while
        // because in the case when the nuber of linked list is larger and we want to
        // add at a particular index we can't make sure how many time does the loop is
        // going to execute
        Node new_node = new Node(x);
        Node q = head;
        int i = 0;
        if (index == 0) {
            add(x);
            return;
        }
        size++;
        while (i < index - 1) {
            q = q.next;
            i++;
        }
        /*
         * for(int i = 0;i<index-1;i++)
         * {
         * q = q.next;
         * }
         */
        new_node.next = q.next;
        q.next = new_node;
    }

    // ************************************Adding at last of the linkedlist
    public void last(int x) {
        Node new_node = new Node(x);
        // size++;
        // if (head == null) {
        // head = tail = new_node;
        // return;
        // }
        // tail.next = new_node;
        // tail = new_node;
        Node q = head;
        while (q.next != null) {
            q = q.next;
        }
        q.next = new_node;
        new_node.next = null;
    }

    // ************************printing the list***************************
    public void print() {
        if (head == null) {
            System.out.println("Linked list is empty ");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    // **************************Removing the first Node of the linked list
    public void rfirst() {
        if (size == 0) {
            System.out.println("Linked list is empty !!");
            // return Integer.MAX_VALUE;
        } else if (size == 1) {
            // int temp = head.data;
            head = tail = null;
            size = 0;
            // return temp;
        }
        // int temp = head.data;
        head = head.next;
        size--;
        // return temp;
    }

    // *****************************Removing Node at given location
    public void rremove(int index) {
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        // for (int i = 0; i < index - 1; i++) {
        // temp = temp.next;
        // }
        // Node q = new Node(index);
        // int store = q.data;
        // q = temp.next;
        // temp.next = q.next;
        // size--;
        // return store;
    }

    // ************************************Removing last Node of the Linked list
    public void rlast() {
        // if (size == 0) {
        //     System.out.println("Linked list is empty !!");
        //     return Integer.MAX_VALUE;
        // } else if (size == 1) {
        //     int temp = head.data;
        //     head = tail = null;
        //     size = 0;
        //     return temp;
        // }
        // Node temp = head;
        // int i = 0;
        // while (i < size - 2) {
        //     temp = temp.next;
        //     i++;
        // }
        // // **********By using for loop *************************
        // /*
        //  * for(int i =0;i<size-2;i++)
        //  * {
        //  * temp = temp.next;
        //  * }
        //  */
        // int store = tail.data;
        // temp.next = null;
        // tail = temp;
        // size--;
        // return store;
        Node q = head;
        while (q.next.next!=null) 
        {
         q = q.next;   
        }
        q.next = null;
    }

    // **************************For searching for an element in the linked list
    public int search(int data) // Time complexity is O(n)
    {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == data) {
                System.out.println("Element found at " + i + " th position !!!");
                return 1;
            }
            temp = temp.next;
            i++;
        }
        System.out.println("Element not found :)");
        return -1;
    }

    // **************************By using recursen function*******************
    public int helper(Node head, int sea)

    {
        if (head == null) {
            return -1;
        }
        if (head.data == sea) {
            return 0;
        }
        int index = helper(head.next, sea);
        if (index == -1) {
            return -1;
        }
        return index + 1;
    }

    public int recursen(int sea) {
        return helper(head, sea);
    }

    // *************************Reverse the linked list
    public int reverse() {
        Node pre = null; // Coz apde current ne head assign kar su ane head ni phela badhu null hoi
        Node curr = tail = head;// java ma assign right thi thai
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        head = pre;
        return pre.data;
    }

    public void remove_nth_node_last(int n) {
        // calculate size of linked list
        int sizee = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sizee++;
        }
        if (n == sizee) {
            head = head.next;// remove first node
            return;
        }
        int i = 1;
        int find = sizee - n;// coz (sizee-n+1) thij apde e node e poch su par apde ena this ek ocha uper
                             // javu che
        Node per = head;
        while (i < find) {
            per = per.next;
            i++;
        }
        per.next = per.next.next;
        return;
    }

    // ********************** To check whether the given linked list is palindrom
    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // Find the middle of the list
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the list
        Node prev = null;
        Node curr = slow;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Compare the first half and the reversed second half
        Node firstHalf = head;
        Node secondHalf = prev;
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    // ***********To check whwther ther is a cycle is persent or not */
    public boolean tofindcycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static Node head;
    public static Node tail;
    public static int size;// To find the size of the linkedlist

    public static void main(String[] args) {
        Ll l = new Ll();
        System.out.println("Enter the no. of number you have to add in the linkedlist : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number : ");
            int x = s.nextInt();
            l.add(x);
        }
        // head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = new Node(4);
        // head.next.next.next.next = head;

        System.out.println("Before removing any data the linked list is : ");
        l.print();
        // l.add(7,3);
        // l.print();
        l.rlast();
        l.print();
        // System.out.println("The size of the linkedlist is :- " + size);// coz the
        // size is static in this program
        // System.out.println("");
        // l.rfirst();
        // System.out.print("After removing first node the linked list is : ");
        // l.print();
        // System.out.println("The size of the linkedlist after removing first node is
        // :- " + size);
        // System.out.println("");
        // l.rlast();
        // System.out.print("After removing last node the linked list is : ");
        // l.print();
        // System.out.println("The size of the linkedlist after removing last node is :-
        // " + size);
        // System.out.println("");
        // l.rremove(5);
        // System.out.print("After removing " + 5 + " node the linked list is : ");
        // l.print();
        // System.out.println("The size of the linkedlist after removing " + 5 + " node
        // is :- " + size);
        // System.out.println("");
        // System.out.print("Enter the number to search for : ");
        // int sh = s.nextInt();
        // l.search(sh);
        // System.out.println("");
        // System.out.print("Searching element by Recursen :" + l.recursen(sh));
        // System.out.println(" ");
        // System.out.print("The linked list in reverse order is : ");
        // l.reverse();
        // l.print();
        // System.out.println("");
        // System.out.print("Enter the number no node which you want to remove from last
        // : ");
        // int last = s.nextInt();
        // l.remove_nth_node_last(last);
        // System.out.print("The linked list is : ");
        // l.print();
        // System.out.println("");
        // System.out.print("For checking if the linked list is palindrom or not :");
        // System.out.println(l.isPalindrome());
        System.out.println(l.tofindcycle());
        s.close();
    }
}