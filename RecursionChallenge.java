import java.util.*;
public class RecursionChallenge {
	public static void main(String[] args) {
		
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int k=recursionChallenge(n);
   System.out.println(k);
   String rt=remove(k+"",(""+k).length()-1);
   System.out.println(rt);
}
	private static int recursionChallenge(int n) {
		if(n==0||n==1)
           return 1;
		return	n*recursionChallenge(n-1);
	}

	private static String remove(String k,int l) {
		if(l==-1)
			return "";		
		if(k.charAt(l)!='7'&&k.charAt(l)!='4'&&k.charAt(l)!='8') {
			return remove(k,l-1)+k.charAt(l);
		}else {
			return remove (k,l-1);
		}
		 
	}

   
}
