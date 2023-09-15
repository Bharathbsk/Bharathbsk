import java.util.*;
public class Result {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
    List<Integer> list=new ArrayList<>();
	for(int i=0;i<n;i++) {
		list.add(sc.nextInt());
	}
	long ret=getMaximumSumOfHeights(list);
	System.out.println(ret);
}

public static long getMaximumSumOfHeights(List<Integer> maxHeight) {
	long big=maxHeight.get(0);
	int x=0;
	for(int i=0;i<maxHeight.size();i++) {
		if(big<maxHeight.get(i)) {
			big=maxHeight.get(i);
			x=i;
		}
	}
	long sum=0;
	for(int i=0;i<maxHeight.size();i++) {
		if(i<=x+1) {
			sum=sum+maxHeight.get(i);
		}else {
			sum=sum+maxHeight.get(x+1);
		}
	}
	
	return sum;
}
}
