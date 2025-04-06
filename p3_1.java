import java.util.*;
public class p3_1 
{
    public static class Node
    {
        int data;
        Node next;
        Node(int x)
        {
            this.data = x;
            this.next = null;
        }
    }
    public void add(int x)
    {
        Node q = new Node(x);
        q.next = head;
        head = q;
    }
    public void print()
    {
        Node q = head;
        while(q!=null)
        {
            System.out.print(q.data+"->");
            q = q.next;
        }
        System.out.print("Null");
    }
    public static Node head;
    public static void main(String[] args) 
    {
        p3_1 p = new p3_1();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the Linked list : ");
        int size = s.nextInt();
        for(int i = 0;i<size;i++)
        {
            System.out.print("Enter the "+(i+1)+" element : ");
            int x = s.nextInt();
            p.add(x);
        }
        System.out.print("The linked list is : ");
        p.print();
    }
}
