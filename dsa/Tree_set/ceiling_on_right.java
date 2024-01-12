package Tree_set;
import java.util.*;
public class ceiling_on_right {
    public static void closestGreater(int []arr) {
        int n=arr.length;
        TreeSet<Integer> ts=new TreeSet<Integer>();
        ArrayList<Integer>ceillings=new ArrayList<Integer>(n);

        for(int i=n-1;i>=0;i--)
        {
            Integer greater =ts.ceiling(arr[i]);
            // ts.ceiling(arr[i]) finds the smallest element in the TreeSet ts that is greater than or equal to arr[i]. If such an element exists, it is assigned to the greater variable; otherwise, null is assigned.
            if (greater==null)
            ceillings.add(-1);
            else
            ceillings.add(greater);
            ts.add(arr[i]);
        }

        for(int i=n-1;i>=0;i--)
        {
            System.out.print(ceillings.get(i)+" ");
        }
        
    }

    public static void main(String[] args) {
        
            int []arr={50,20,200,100,30};
            closestGreater(arr);
        }
    }

