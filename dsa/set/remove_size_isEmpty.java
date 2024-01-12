package set;
import java.util.*;
public class remove_size_isEmpty {
    public static void main(String[] args) {
        HashSet<String>h=new HashSet<String>();
        h.add("gfg");
        h.add("courses");
        h.add("ide");

        System.out.println(h.size());
        h.remove("ide");
        System.out.println(h.size());
        for(String s:h)
        {
            System.out.println(s+ " ");
        }

        System.out.println(h.isEmpty());
    }
    
}
