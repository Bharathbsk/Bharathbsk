import java.util.*;
public class Test {
    public static void main(String[] args) {
		UserMainCode u=new UserMainCode();
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		String[] input2=new String[input1];
		for(int i=0;i<input1;i++)
			input2[i]=sc.next();
		
		String ans=u.findStringVowelFirstAndLast(input1,input2);
		System.out.println(ans);
	
	}
}
