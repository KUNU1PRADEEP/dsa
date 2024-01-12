package ___queue;

public class circular_array {
    static class Queue{

        static int arr[];
        static int size;
        static int front;
        static int rear;

        Queue(int n)
        {
            arr=new int[n];
            size =n;
            rear=-1;
            front=-1;
        }
        public static boolean isEmpty() {
            return rear==-1 && front==-1;
            
        }
        public static boolean isFull() 
        {
            return (rear+1)%size==front;
            
     
        }

        public static void add(int data)
        // O(1)
        {
            if(isFull())
            {
                System.out.println("queue is full.");
            return;
            }
            // add 1st element.
            if(front==-1)
            {
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }

        public static int remove()
        // O(1)
        {
            if(isEmpty())
            {
                System.out.println("empty queue.");
                return -1;

            }

             int result=arr[front];
            // last element delete
            if(rear==front)
            {
                rear=front=-1;
            }
            else
            {
                front=(front+1)%size;
            }
           
            return result;
            
        }

        public static int peek() 
        // O(1)
        {
            if(isEmpty())
            {
                System.out.println("queue is empty.");
                return -1;
            }
            return arr[front];

            
        }
    }
    public static void main(String[] args) {
            Queue q=new Queue(3);
            q.add(1);
            q.add(2);
            q.add(3);
            
            // while(!q.isEmpty())
            // {
            //     System.out.println(q.peek());
            //     q.remove();
            // }

            System.out.println(q.remove());
            q.add(4);
            System.out.println(q.remove());
            q.add(5);
        
    }
    
}
