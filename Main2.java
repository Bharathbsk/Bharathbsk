import java.util.Scanner;
public class Main2 {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 String a=sc.next();
		 int b=sc.nextInt();
		 String rt=getSmallestString(a,b);
		 System.out.println(rt);
	}

	public static String getSmallestString(String word,int k) {
		String ret="";
		for(int i=0;i<word.length();i++) {
			int count=0;
			for(int j=i;j<word.length();j++) {
				if(word.charAt(i)==word.charAt(j)) {
					if(j<i+3) {
						count++;
					}
				}
			}
			if(count!=3) {
				ret=ret+word.charAt(i);
			}
		}
		return ret;
	}
  
}