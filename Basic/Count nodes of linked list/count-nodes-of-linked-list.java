//{ Driver Code Starts
import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int a){
        data = a;
        next = null;
    }
    
}

// } Driver Code Ends
/*Complete the function below*/
/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution
{
    public static int getCount(Node head)
    {
        
        
        int count = 0;
        
        // create the duplicate Node 
        Node temp = head;
        
        // iterate the Node until its null
        while(temp!=null){
            
            count+=1;
            
            temp = temp.next;
        }
        
        return count;
    }
}
    

//{ Driver Code Starts.
class LinkedList{
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            
            Solution ob = new Solution();
            System.out.println(ob.getCount(head));
        }
    }
   
    
    
    
}


// } Driver Code Ends