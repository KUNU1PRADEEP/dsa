package ___queue.D_e_que;
import java.util.*;
public class used_as_queue {
    static class Queue{
        Deque<Integer>deque=new LinkedList<>();
        public void add(int data)
        {
            deque.addLast(data);
        }
        public void remove(){
             deque.removeFirst();
        }

        public int peek()
        {
            return deque.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
    
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek());
        q.remove();
        // System.out.println(q);
        // System.out.println(q.remove());
        

}
    
}
