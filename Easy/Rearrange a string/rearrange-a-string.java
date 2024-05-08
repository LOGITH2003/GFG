//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.arrangeString(s));
                }
                
        }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String arrangeString(String s)
        {
            String str = "";
            int count = 0;
            char [] Char =s.toCharArray();
            Arrays.sort(Char);
            for(char c : Char){
                if(Character.isDigit(c))
                    count+= c -'0';
                else
                    str += c;
            }
            return (count!=0 ?str+Integer.toString(count): str);
        }
}
