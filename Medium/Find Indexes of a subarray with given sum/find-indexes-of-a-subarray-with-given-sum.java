//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	static BufferedReader br;
    static PrintWriter ot;
    public static void main(String[] args) throws IOException{
        
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            
            String s[] = br.readLine().trim().split(" ");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(a, n, k);
            for(int ii = 0;ii<res.size();ii++)
                ot.print(res.get(ii) + " ");
            ot.println();
        }
        ot.close();
    }

}
// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        
        // create the array list to return the postion value
        ArrayList<Integer> list = new ArrayList<>();


        int start = 0, end = 0,count = 0;

        
        // sliding window concepts
        while(end<n){

            count += arr[end++];

            // if the count greater that s remove the value for start position 
            while(s<count && start <end-1){
                count -= arr[start++];
            }
            
            // if the count is equal to the s return the position
            if(count == s){
                list.add(start+1);
                list.add(end);
                return list;
            }

        }

        // if the given value can't able to reach return the value -1
        list.add(-1);
        
        return list;
       
    }
}
