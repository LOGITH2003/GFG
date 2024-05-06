//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	    int t=Integer.parseInt(br.readLine().trim());
	    while(t > 0)
	    {
	        int n= Integer.parseInt(br.readLine().trim());
	        String x = br.readLine().trim();
	        String string_list[] = x.split(" ",n);
	        
	        Solution ob = new  Solution();
	        
	        List <List<String>> ans = ob.Anagrams(string_list);
	        
	        Collections.sort(ans, new Comparator<List<String>>(){
            public int compare(List<String> l1, List<String> l2) {
                    String s1 =  l1.get(0);
                    String s2 = l2.get(0);
                    
                    return s1.compareTo(s2);
                }
            });
	        
	        for(int i=0;i<ans.size();i++)
	        {
	            for(int j=0;j<ans.get(i).size();j++)
	            {
	                System.out.print(ans.get(i).get(j) + " ");
	            }
	            System.out.println();
	        }
	       
	       
            t--;
	    }
	}
    
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    public List<List<String>> Anagrams(String[] string_list) {

	// create the hashmap to store the anagram string index value
	HashMap<String,List<Integer>> map = new HashMap<>();

	// iterate the array
        for(int i = 0;i<string_list.length;i++){

	    // convert the string into character array and sorting the character array and again convert into string for the checking purchase of anagram
            char [] c = string_list[i].toCharArray();
            Arrays.sort(c);
            String s = new String(c);

	    // add the index and string in the hashmap
            if(map.containsKey(s)){
                List<Integer>  val = map.get(s);
                val.add(i);
                map.put(s,val);
            }
            else {
                List<Integer> val = new ArrayList<>();
                val.add(i);
                map.put(s,val);
            }
        }

	// once iterate all the string in the hashmap and start move to next phase
	// create the list<list<string>> and sort the comman anagram string separate list and store all the list in one list and return it.
        List<List<String>> list = new ArrayList<>();
        for(var ls : map.entrySet()){
            List<String> val = new ArrayList<>();
            for(int n : ls.getValue()){
                val.add(string_list[n]);
            }
            list.add(val);
        }

	// return the list.
        return list;
    }
}
