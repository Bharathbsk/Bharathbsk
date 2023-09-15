import java.util.Scanner;
public class FindOrderWordCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FindOrderWordCount m=new FindOrderWordCount();
         String a=sc.next();
         int k=m.findCountOfOrderedWords(a);
         System.out.println(k);
         

	}

	public int findCountOfOrderedWords(String input1) {
		int c=0;
		for(String s:input1.split(" ")) {
			String x="";
			int N=s.length();
			int[] freq=new int [256];
			for(int i=0;i<256;i++) {
				freq[i]=0;
			}
          for(int i=0;i<N;i++) {
        	  char character=s.charAt(i);
        	  int val=(int)character;
        	  freq[val]++;
          }
          for(int i=0;i<256;i++) {
        	  for(int j=0;j<freq[i];j++) 
        		  x=x+(char)i;
        	  }
        	  if(x.equals(s)) 
        		  c++;
          }
		return c;
	}
}
