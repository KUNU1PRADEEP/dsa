package ___queue;

import java.util.LinkedList;
import java.util.Queue;

public class meth_queue {
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<5;i++)
        {
            q.add(i);
        }
        System.out.println("Element of queue"+q);
        int removable=q.remove();
        System.out.println(removable);
        int head=q.peek();
        System.out.println(head);
        int size=q.size();
        System.out.println(size);
    }
    
}
