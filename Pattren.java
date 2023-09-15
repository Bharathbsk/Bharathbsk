import java.util.*;
public class Pattren {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter n Value");
			int n=sc.nextInt();
			
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					for(int k=1;k<=i+i;k++) {
						System.out.print("*");
					}
					System.out.println();
				}
				if(i<n) {
				for(int k=1;k<=n;k++) {
					System.out.println("*");
				}
				}
				
			}
		}
}
