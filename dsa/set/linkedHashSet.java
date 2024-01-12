package set;
import java.util.*;
public class linkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> s=new LinkedHashSet<Integer>();
        s.add(10);
        s.add(20);
        s.add(30);
        for(Integer x: s)
        {
            System.out.print(x+ " ");
        }
    }
    
}
