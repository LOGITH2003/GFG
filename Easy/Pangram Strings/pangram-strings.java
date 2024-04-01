//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPanagram(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPanagram(String S) {
        S = S.toLowerCase();
        HashSet<Character> list = new HashSet<>();
        
        // iterate the string to hashset
        for(int i = 0;i<S.length();i++)
            if(S.charAt(i)<=122 && S.charAt(i)>=97)
                list.add(S.charAt(i));
        
        return list.size() ==26?1:0;
    }
};