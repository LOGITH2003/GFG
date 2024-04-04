//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    //taking the String
		    String s=sc.nextLine();
		    Solution ob = new Solution();
		    //calling method sumSubstrings() 
		    System.out.println(ob.sumSubstrings(s));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static long sumSubstrings(String s)
    {
        final int MOD = 1000000007; 
        long result = 0;
        long current = 0;

        // iterate the array        
        for (int i = 0; i < s.length(); i++) {
            current = (current * 10 + (i + 1) * (s.charAt(i) - '0')) % MOD;
            result = (result + current) % MOD;
        }
        return result;

    }
}