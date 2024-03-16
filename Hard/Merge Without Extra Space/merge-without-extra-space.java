//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.io.*;

public class Main
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int m = Integer.parseInt(inputLine[1]);
		    long arr1[] = new long[n];
		    long arr2[] = new long[m];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr1[i] = Long.parseLong(inputLine[i]);
		    }
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<m; i++){
		        arr2[i] = Long.parseLong(inputLine[i]);
		    }
		    Solution ob = new Solution();
		    ob.merge(arr1, arr2, n, m);
		    
		    StringBuffer str = new StringBuffer();
		    for(int i=0; i<n; i++){
		        str.append(arr1[i]+" ");
		    }
		    for(int i=0; i<m; i++){
		        str.append(arr2[i]+" ");
		    }
		    System.out.println(str);
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        ArrayList<Long> list = new ArrayList<>();
        
        int index1 = 0;
        int index2 = 0;
        
        while(index1 < arr1.length && index2 < arr2.length)
        {
            if(arr1[index1] <= arr2[index2])
            {
                list.add(arr1[index1]);
                index1++;
            }
            else
            {
                list.add(arr2[index2]);
                index2++;
            }
        }
    
        // Add remaining elements from arr1
        while(index1 < arr1.length)
        {
            list.add(arr1[index1]);
            index1++;
        }
        
        // Add remaining elements from arr2
        while(index2 < arr2.length)
        {
            list.add(arr2[index2]);
            index2++;
        }
        
        // Distribute sorted elements back into arr1 and arr2
        for(int i = 0; i < n; i++)
        {
            arr1[i] = list.get(i);
        }
        
        for(int i = 0; i < m; i++)
        {
            arr2[i] = list.get(n + i);
        }
    
    }
}
