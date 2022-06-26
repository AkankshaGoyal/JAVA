package mynewworld;
import java.util.*;
public class linkedlist {
    public static void main(String args[])
    {
        LinkedList<String> ll  = new LinkedList<String>();
        ll.add("Geeks");
        ll.add("Geeks");
        ll.add(1,"For");
        for(int i=0;i<ll.size();i++)
        {
            System.out.println(ll.get(i)+" ");
        }
    }
}
