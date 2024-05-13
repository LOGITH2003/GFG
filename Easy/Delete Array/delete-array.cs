//{ Driver Code Starts
//Initial Template for C#


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using DriverCode;

namespace DriverCode
{

    class GFG
    {
        static void Main(string[] args)
        {
            int testcases;// Taking testcase as input
            testcases = Convert.ToInt32(Console.ReadLine());
            while (testcases-- > 0)// Looping through all testcases
            {
                int N = Convert.ToInt32(Console.ReadLine());
                int[] arr = new int[N];

                string elements = Console.ReadLine().Trim();
                elements = elements + " " + "0";
                arr = Array.ConvertAll(elements.Split(), int.Parse);

                Solution obj = new Solution();
                obj.DeleteArray(arr);
                int sum = 0;
                for(int i = 0;i<N;i++){
                    sum += arr[i];
                }
                
                Console.WriteLine(sum);
                Console.WriteLine(arr[0]);
            }

        }
    }
}

// } Driver Code Ends


//User function Template for C#

class Solution
{
    //Complete this function
    int count = 0;
    public void DeleteArray(int[] arr)
    {
        for(int i = 0;i<arr.Length;i++){
            count += arr[i];
            
        }
        // Console.WriteLine(count);
        // Console.WriteLine(arr[0]);
    }
}