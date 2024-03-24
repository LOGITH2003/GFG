//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int ans[] = obj.Series(n);
            for (int i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {


    
    int[] Series(int n) {
        int [] nums = new int[n+1];

        int n1 = 0, n2 = 1;

        for(int i =0;i<=n;i++){
            nums[i] = n1%1000000007;
            int next = (n1 + n2) % 1000000007; 
            n1 = n2;
            n2 = next;
        }
        return nums;
       
    }
}