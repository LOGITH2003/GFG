//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.firstElement(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static int firstElement(int n) {
        // code here
        if(n==1)
         return 1;
        if(n==2)
         return 1;
        if(n==3)
         return 2;
        int prev1=2;
        int prev2=1;
        for(int i=4;i<=n;i++){
            int t=prev1;
            prev1=(prev1+prev2)% 1000000007;
            prev2=t;
        }
        return prev1;
    }
}