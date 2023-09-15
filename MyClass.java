import java.util.*;
public class MyClass{
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int ret=0;
		for(int i=0;i<n;i++) {
			if(m==i)
			{
		    ret=arr[i];
			}
		}
		sc.close();
		System.out.println(ret);
}
}
