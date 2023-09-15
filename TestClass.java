import java.util.*;
public class TestClass {
   public static void main(String[] args) throws Exception{
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	String b=sc.next();
	sc.close();
	List<Character> a1=new ArrayList<>();
	List<Character> b1=new ArrayList<>();
	if(a.length()==b.length()) {
		for(int i=0;i<a.length();i++) {
			a1.add(a.charAt(i));
			b1.add(b.charAt(i));
		}
	Collections.sort(a1);	
	Collections.sort(b1);
	int k=1;
		for(int i=0;i<a1.size();i++) {
			if(a1.get(i)==b1.get(i)) {
				
			}else {
				k=-1;
				break;
			}
		}
		
		System.out.println(k);
	}else {
		System.out.println(-1);
	}	
   } 
}







//	String [][]A=new String [N][5];
//	for(int i=0;i<N;i++) {
//		for(int j=0;j<5;j++) {
//			A[i][j]=sc.next();
//		}
//	}
//	String D=sc.next();
//	String V=sc.next();
//	String ret[][]=t.solve(N,A,D,V);
//	for(int i=0;i<ret.length;i++) {
//		for(int j=0;j<ret[0].length;j++) {
//			System.out.print(ret[i][j]+" ");
//		}
//		System.out.println();
//	}
//}
//public String[][] solve(int N, String[][] A, String D, String V) {
//	int count=0;
//    List<Integer> li=new ArrayList<>();
//	for(int i=0;i<N;i++) {
//		for(int j=0;j<5;j++) {
//			if(A[i][j].contentEquals(V)) {
//				count++;
//				li.add(i);
//			}
//		}
//	}
//	List<String> kk=new ArrayList<>();
//	String ret[][]=new String[count][5];
//	int k=li.size()-1;
//	for(int i=0;i<N;i++) {
//		if(k<li.size())
//		if(i==li.get(k)) {
//		for(int j=0;j<5;j++) {
//	         kk.add(A[i][j]);
//			}
//		k--;
//		}
//		}
//	int mm=0;
//	for(int i=0;i<count;i++) {
//		for(int j=0;j<5;j++) {
//	        ret[i][j]=kk.get(mm);
//	        mm++;
//			}
//		}
//	return ret;
//}
//}
