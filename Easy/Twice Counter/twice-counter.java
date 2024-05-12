//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    String list[] = new String[n];
                    for(int i = 0;i<n;i++)
                        list[i] = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.countWords(list, n));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int countWords(String list[], int n)
    {
        HashMap<String,Integer> ls = new HashMap<>();
        int count = 0;
        for(String val : list){
            ls.put(val,ls.getOrDefault(val,0)+1);
        }
        
        for(var  val : ls.values()){
            if(val==2) count++;
        }
        return count;
    }
}