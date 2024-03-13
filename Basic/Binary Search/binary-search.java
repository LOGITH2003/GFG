//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
            T--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int binarysearch(int arr[], int n, int k) {
        
        // create the two integer variable
        int start = 0;
        int end = n-1;
        
        // applying binary search
        while(start <= end)
        {
            // create the mid value
            int mid = start + (end-start)/2;
            
            //if array contain the k value return the position
            if(arr[mid] == k)
                return mid;
                
            else if(arr[mid] < k)
                start = mid + 1;
            
            else
                end = mid - 1;
        }
        
        // if the k value is not in array 
        return -1;
    }
}