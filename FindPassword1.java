
import java.util.*;
public class FindPassword1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FindPassword1 m=new FindPassword1();
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int ret=m.findPassword(arr,n);//21036 type
		System.out.println(ret);
	}

	public int findPassword(int[] input1, int input2) {
	        Map<Integer,Integer> numbers = new HashMap();
	        for(int i=0;i<input2;i++) {
	            if(numbers.get(input1[i]) == null) {
	                numbers.put(input1[i],0);
	            }
	            numbers.put(input1[i],numbers.get(input1[i])+1);
	        }
	        TreeSet<Integer> values = new TreeSet(numbers.values());
	        int firstaNo = getMax(numbers,values.last(),true);
	        values.remove(values.last());
	        int secondNo = getMax(numbers,values.last(),true);
	        int thirdNo = getMax(numbers,values.first(),false);
	        return Integer.parseInt(firstaNo+""+secondNo+""+thirdNo);
	    }
	    public int getMax(Map<Integer,Integer> numbers, int occ, boolean isMax) {
	        int compareNo = isMax?Integer.MIN_VALUE:Integer.MAX_VALUE;
	        for(int key : numbers.keySet()){
	            if(numbers.get(key) == occ) {
	                if(isMax) {
	                    if(key>compareNo) {
	                    compareNo = key;
	                    }
	                } else
	                    if(key<compareNo)
	                     compareNo = key;
	            }
	        }
	        return compareNo;
	    
		}
	}
//        List<Integer> li=new ArrayList<>();
//        String k="";
//        int fc=0;
//        int m=0;
//        int sc=0;
//        int sum=0;
//        int sum1=0;
//        if(input1.length>1) {
//           for(int i=0;i<input1.length;i++) {
//             int cou=0;
//             int count=0;
//              for(int j=0;j<input1.length;j++) {
//                if(input1[i]==input1[j]) {
//                  count++;
//                }
//                if(i!=j) {
//                  if(input1[i]==input1[j]) {
//                    cou++;
//                  }
//                }
//                 }
//              if(cou==0) {
//                li.add(input1[i]);
//              }
//                if(count>sum) {
//                  sc=fc;
//                  fc=input1[i];
//                  sum=count;
//                }
//                if(count>sum1 && count<sum) {
//                  sc=input1[i];
//                  sum1=count;
//                }
//              count=0;
//           }
//        }
//        Collections.sort(li);
//        m=li.get(0);
//        k=k+fc+sc+m;
//        int ret=Integer.parseInt(k);
//        return ret;
//      }
//    
//}