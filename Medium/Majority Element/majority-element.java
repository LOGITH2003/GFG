//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        HashMap<Integer,Integer> list = new HashMap<>();
        int max = 0,val = 0;

        for(int n : a)
        {
            if(list.containsKey(n)){
                list.put(n, list.get(n)+1);
                
                if(list.get(n)>max){
                    max = list.get(n);
                    val = n;
                }
            }
            else{
                list.put(n,1);
                if(list.get(n)>max){
                    max = list.get(n);
                    val = n;
                }
            }
        }

        return max > size/2 ?val:-1;
    }
}