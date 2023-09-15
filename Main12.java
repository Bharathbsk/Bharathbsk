import java.util.*;
public class Main12 {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int r=sc.nextInt();
	int x=sc.nextInt();
	findPublicPrivateKey(n,r,x);
}

 static void findPublicPrivateKey(int P, int R, int x) {
	 List<Integer> li=new ArrayList<>();
	 for(int i=P;i<=R;i++) {
		 int k=digitSum(i);
		 if(k==x) {
			 li.add(i);
		 }
	 }
	 System.out.println(li.get(0));
	 System.out.println(li.get(li.size()-1));	
    }
   private static int digitSum(int i) {
	int sum=0;
	while(i>0) {
		int r=i%10;
		sum=sum+r;
		i=i/10;
	}
	return sum;
}

     
}
