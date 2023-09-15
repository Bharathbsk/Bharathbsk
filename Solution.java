import java.util.*;
public class Solution{
   
// Function to find the minimum
// distance travelled to visit
// K point
static int MinDistK(int arr[],
                    int N, int K)
{      
  // Stores minimum distance
  // travelled to visit K point
  int res = Integer.MAX_VALUE;
 
  // Stores distance travelled
  // to visit points
  int dist = 0;
 
  // Traverse the array arr[]
  for (int i = 0;
           i <= (N - K); i++)
  {
    // If arr[i] and arr[i + K - 1]
    // are positive
    if (arr[i] >= 0  && 
        arr[i + K - 1] >= 0)
    {
      // Update dist
      dist = Math.max(arr[i],
                      arr[i + K - 1]);
    }
    else
    {
      // Update dist
      dist = Math.abs(arr[i]) +
             Math.abs(arr[i + K - 1]) +
             Math.min(Math.abs(arr[i]),
             Math.abs(arr[i + K - 1]));
    }
 
    // Update res
    res = Math.min(res, dist);
  }
 
  return res;
}
   
// Driver Code
public static void main(String args[])
{
  int K = 4;
  // initial the array
  int arr[] = {1,3,18,20};
 
  int N = arr.length;
  System.out.println(MinDistK(arr, N, K));
}
}