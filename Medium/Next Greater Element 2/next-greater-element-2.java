//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            int ans[] = obj.nextGreaterElement(n, a);
            for (int e : ans) System.out.print(e + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int[] nextGreaterElement(int N, int arr[]) {
        int [] nums = new int[N];
        int maxValue = Arrays.stream(arr).max().getAsInt();
        for(int i = 0;i<N;i++){
           
            int index = i+1,max = 0;
            for(int j = 0;j<N;j++){
                if(maxValue == arr[i]) {
                    nums[i] = -1;
                    break;
                }
                if(index==N)
                    index = 0;
                if(arr[i]<arr[index]){
                    nums[i] = arr[index];
                    break;
                }
                index++;
            }

        }
        return nums;
    }
}
