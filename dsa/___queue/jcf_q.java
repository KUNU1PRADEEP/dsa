package ___queue;
import java.util.*;
public class jcf_q {
    public static void main(String[] args) {
        // Queue<Integer> q=new LinkedList<>();  //ArrayDeque
        Queue<Integer>q=new ArrayDeque<>();

        // queue is an iterface . so, object can't be created from theis name/
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
