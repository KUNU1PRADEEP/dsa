package set;

import java.util.*;

public class hashset_printing_repeating_element {
    static void printRepeating(int arr[])
    {
       HashSet<Integer>s=new HashSet<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(s.contains(arr[i])==true)
            {
                System.out.println((arr[i])+" ");
                s.add(arr[i]);

            }
        }


    }
    public static void main(String[] args) {
        int arr[]={10,20,10,10};
        printRepeating(arr);
        
    }
    
}
