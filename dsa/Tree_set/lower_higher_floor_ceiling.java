package Tree_set;

import java.util.TreeSet;

public class lower_higher_floor_ceiling {
    public static void main(String[] args) {
        TreeSet<Integer>s=new TreeSet<Integer>();
        s.add(10);
        s.add(5);
        s.add(2);
        s.add(15);
        System.out.println(s.lower(5));
        System.out.println(s.higher(5));
        System.out.println(s.floor(5));
        System.out.println(s.ceiling(5));
    }
    
}
