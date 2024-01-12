package set;
import java.util.*;
public class lnkedHashSet_duplicate {

   public static void main(String[] args) {
     LinkedHashSet<Integer>s=new LinkedHashSet<Integer>();
     s.add(10);
     s.add(20);
     s.add(30);
    //  s.remove(10);
     s.add(10);
     System.out.println(s);



   }

    
}
