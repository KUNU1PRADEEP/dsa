package Tree_set;

import java.util.*;



public class add_contain_iterator {
    public static void main(String[] args) {
    //    TreeSet<Integer>s=new TreeSet<Integer>(); 
        TreeSet<String> s=new TreeSet<String>();
        s.add("gfg");
        s.add("courses");
        s.add("ide");
        s.remove("ide");
        //print in sorted order 
        System.out.println(s);
        System.out.println(s.contains("ide"));

        //  Iterator<String> i=s.iterator();
        // while(i.hasNext())
        // System.out.println(i.next());

        for(String x:s)
        System.out.println(x+" ");
    }
    
}
