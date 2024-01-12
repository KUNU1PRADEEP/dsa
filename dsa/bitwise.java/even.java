public class even {

     public static void Check(int n)
        
        {// int bitmask=1;
        String b=((n&1)==0)?"even":"odd";
        System.out.println(b);}
    public static void main(String[] args) 
    {
       Check(5);
    }
    
}
