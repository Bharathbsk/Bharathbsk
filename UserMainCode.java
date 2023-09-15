import java.util.*;
public class UserMainCode {
  public static void main(String[] args) {
	  UserMainCode m=new UserMainCode();
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int n1=sc.nextInt();
	  m.minSteps(n,n1);
	  
  }
 public void minSteps(int a, int b)
  { 
	    int ans = 0;
	 
	    // Check if the absolute
	    // difference is 1 or 0
	    if (a == b || Math.abs(a - b) == 1)
	    {
	      ans = a + b;
	    }
	 
	    else
	    {
	 
	      // Store the minimum of a, b
	      int k = Math.min(a, b);
	 
	      // Store the maximum of a, b
	      int j = Math.max(a, b);
	      ans = 2 * k + 2 * (j - k) - 1;
	    }
	 
	    // Print the answer
	    System.out.print(ans);
	  }
}
	  
//	  int ar[]=new int[n+1];
//	  for(int i=0;i<=n;i++) {
//		  ar[i]=sc.nextInt();
//	  }
//	  int ret=m.harry(n,ar);
//	 System.out.println(ret); 
//  }
//
//public int harry(int input1, int[] input2) {
//	int sum=0;
//	for(int i=0;i<input2.length;i++) {
//		int k=input2[i]/input1;
//		if(k!=0) {
//			sum=sum+input2[k];
//		}
//	}
//	
//	return sum;
//}
//}
	  
	  
//   int ret[]=m.DupliCateArray(n,ar);
//   for(int i=0;i<ret.length;i++)
//	   System.out.print(ret[i]+" ");
//}
//
//public int[] DupliCateArray(int input1, int[] input2) {
//	Set<Integer> li=new TreeSet<>();
//	for(int i=0;i<input1;i++) {
//		int c=0;
//		for(int j=0;j<input1;j++) {
//			if(i!=j) 
//				if(input2[i]==input2[j]) {
//					c++;
//				}
//		}
//		 if(c!=0)
//	    	  li.add(input2[i]);
//	}
//	int ar[]= {-1};
//	if(li.size()==0)
//		return ar;
//	int rt[]=new int[li.size()];
//	int k=0;
//	for(int x:li) {
//		rt[k]=x;
//		k++;
//	}
//	return rt;
//}
//
//}
  
//  int ret=m.lds(n,ar);
//  System.out.println(ret);  
  
//public int lds(int input1, int[] input2) {
//	 int lds[] = new int[input1];
//	    int i, j, max = 0;
//	    for (i = 0; i <input1; i++)
//	        lds[i] = 1;
//	    for (i = 1; i < input1; i++)
//	        for (j = 0; j < i; j++)
//	            if (input2[i] < input2[j] &&
//	                         lds[i] < lds[j] + 1)
//	                lds[i] = lds[j] + 1;
//	    for (i = 0; i < input1; i++)
//	        if (max < lds[i])
//	            max = lds[i];
//	    return max;
// }
//}
