public class remove_cycle 
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
        q.next = head.next;
        head = q;
    }
    public void print()
    {
        Node q = head;
        while(q!=null)
        {
            System.out.print(q.data+"->");
            q=q.next;
        }
    }
    public boolean iscycle()
    {
        Node slow = head;
        Node fast = head;
        while(fast!=null&&fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                return true;
            }
        }
        return false;
    }
    public void rcycle()
    {
        boolean cycle = false;
        Node slow = head;
        Node fast = head;
        while(fast!=null&&fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                cycle = true;
                break;
            }
            if(cycle = false)
            {
                return;
            }
        }
        slow = head;
        Node per = null;
        while(slow !=fast)
        {
            slow = slow.next;
            per = fast;
            fast = fast.next;
        }
        per.next = null;
    }
    public static Node head;
    public static void main(String[] args) {
        remove_cycle rc = new remove_cycle();
        head = new Node(1);
        head.next = new Node(2);
        Node temp = new Node (5);
        head.next.next = new Node(3);
        head.next.next.next  = new Node(4);
        head.next.next.next.next = temp;
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = temp;
        System.out.println(rc.iscycle());
        rc.rcycle();
        System.out.println(rc.iscycle());
    }
}
