package set;
import java.util.*;
public class add_contain_iterator {
    public static void main(String[] args) {
        HashSet<String> h=new HashSet<String>();
        h.add("gfg");
        h.add("course");
        h.add("ide");

        System.out.println(h);
        System.out.println(h.contains("ide"));
        Iterator<String>i=h.iterator();
        while(i.hasNext())
        {
            System.out.print(i.next()+" ");
        }


    }
    
}
