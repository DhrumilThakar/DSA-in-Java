import java.util.LinkedList;
public class linkedlist_using_java 
{
    public static void main(String[] args) 
    {
        /*create a lnked list
        syntax : - LinkedList<data_type>name_of Linkedlist = new LinkedList<>();*/
        LinkedList<Integer> ll = new LinkedList<>();

        //add elemet
        /*LinkedList name.add_position(data) */
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        ll.add(7, 5);

        //print
        /*System.out.println(LinkedList name); */
        System.out.println(ll);

        //remove
        /*LinkedList name.remove_position(data) */
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
