public class detectcycle 
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
    public static Node head;
    public static Node tail;
    public void add(int x) {
        Node new_node = new Node(x);// creating the new node step 1
        
        // if the given node is empty
        if (head == null) {
            head = tail = new_node;
            return;
        }
        new_node.next = head;// step 3
        head = new_node;// step 4
    }
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
    public boolean tofindcycle()
    {
        Node slow = head;
        Node fast = head;
        while(fast!=null&&fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next;
            if(slow == fast)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) 
    {
        detectcycle d = new detectcycle();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        System.out.println(d.tofindcycle());
    }
}
