//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java
class Solution{
    static long fibSum(long N){
        long ans =0;

        long n1 = 0, n2 = 1;

        for(long i=0;i<=N;i++){
            ans += n1;
            long next = (n1 + n2) % 1000000007;
            n1 = n2;
            n2 = next;
        }
        return ans% 1000000007;
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            long N = Long.parseLong(read.readLine());
           
            Solution ob = new Solution();
            System.out.println(ob.fibSum(N));
        }
    }
}
// } Driver Code Ends