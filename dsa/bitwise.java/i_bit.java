public class i_bit {
  public static void get_ith(int n,int i)
  {
    int bitmask=1<<i;
    if((n&bitmask)==0)
    {
        System.out.println("i_th bit is 0");

    }
    else{
        System.out.println("i_th bit is 1");
    }
}
public static void set_bit(int n, int i) {
    int bitmask=1<<i;
   System.out.println((n|bitmask));
}
public static boolean is_power_of_2(int n) {
    return (n&(n-1))==0;
    
}

    public static void clear_bit(int n, int i) {
        int bitmask=~(1<<i);
        System.out.println((n&bitmask));

    }

    public static int count_set_bit(int n) {
        int count=0;
        while(n>0)
        {
            if((n&1)!=0)
            {
                count++;
            }
            n=n>>1;
        } 
        return count;
        
    }
  
    public static void main(String[] args) {
    // clear_bit(10, 3);
        //    set_bit(10, 2);
        // get_ith(10, 1);

        System.out.println(count_set_bit(15));
        // System.out.println(is_power_of_2(16));
    }
    
}
