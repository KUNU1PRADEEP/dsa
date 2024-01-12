package stack__;

import java.util.*;

public class valid_parenthesis {
    public static boolean isValid(String str) {
        Stack<Character>  s=new Stack<>();


    for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // opening 
            if(ch=='('|| ch=='{'|| ch=='[')
            {
                s.push(ch);
            }

            // closing
            else{
                if(s.isEmpty())
                {
                    return false;
                }
                if((s.peek()=='(' && ch==')')
                ||(s.peek()=='{' && ch=='}')
                ||(s.peek()=='[' && ch==']') )
                {
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(s.isEmpty())
        {
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isDuplicate(String str) {
        Stack<Character>s=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);

            // closing
            if(ch==')')
            {
                int count=0;
                while(s.peek()!='(')
                {
                    s.pop();
                    count++;
                }
                if(count<1)
                {
                    // duplicate
                    return true;
                }
                else
                {
                    // opening pair
                    s.pop();

                }
                

            }
            return false;
        }
        
    }

    public static void main(String[] args) {
        // String str="()({})[]";
        // System.out.println(isValid(str));


        String str="((a+b))";
        String str2="(a-b)";
        System.out.println(isDuplicate(str));
    
    }
    
}
