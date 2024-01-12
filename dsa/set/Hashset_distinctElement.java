package set;

import java.util.HashSet;

public class Hashset_distinctElement {
    static  void printdist(int arr[])
    {
        HashSet<Integer>s= new HashSet<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(s.contains(arr[i])==false)
            {
                System.out.print(arr[i]+" ");
                s.add(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={10,8,4,10,10,4};
        printdist(arr);
    }
    
}
