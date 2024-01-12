package ___queue.D_e_que;

import java.util.Deque;

import link.LInkedList;

public class used_as_stack {
    static class Stack{
        Deque<Integer>deque=new LinkedList<>();
        public void push(int data)
        {
            deque.addLast(data);
        }
        public void pop()
        {
            deque.removeLast();
        }
        public void peek()
        {
            return  deque.getLast();
        }

    }
    public static void main(String[] args) {
        // here, stack use isnot jcf, its just object name.
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.peek();
        System.out.println(s.pop(););
    }
    
}
