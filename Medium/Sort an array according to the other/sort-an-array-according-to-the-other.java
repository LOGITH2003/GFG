//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.HashMap; 
import java.util.Map; 
import java.util.Map.Entry; 


// } Driver Code Ends
//User function Template for Java

class Solution{
    // A1[] : the input array-1
    // N : size of the array A1[]
    // A2[] : the input array-2
    // M : size of the array A2[]
    
    //Function to sort an array according to the other array.
    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> l = new ArrayList<>();
        HashMap<Integer,Integer> ls = new HashMap<>();
        
        for (int num : A1) {
            list.add(num);
            ls.put(num, ls.getOrDefault(num, 0) + 1);
        }
        
        int index = 0;
        
        for (int n : A2) {
        if (ls.containsKey(n)) { // Check if ls contains the key n
            int freq = ls.get(n); // Get the frequency associated with key n
                for (int i = 0; i < freq; i++) {
                    A1[index++] = n; // Add n to A1 freq times
                }
            l.add(n); // Add n to the list l
            }
        }
        Collections.sort(list);
        
        while (list.size() != 0 && index < N) {
            if (!l.contains(list.get(0))) {
                A1[index++] = list.get(0);
            }
            list.remove(0);
        }
        
        return A1;
    }
}



//{ Driver Code Starts.
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int a1[]=new int[n];
		    int a2[]=new int[m];
		    
		    for(int i=0;i<n;i++)
		    a1[i]=sc.nextInt();
		    
		    for(int i=0;i<m;i++)
		    a2[i]=sc.nextInt();
		    Solution ob=new Solution();
		    a1 = ob.sortA1ByA2(a1,n,a2,m);
		    for(int x:a1)
		    System.out.print(x+" ");
		    
		    System.out.println();
		}
	}
	

}



// } Driver Code Ends