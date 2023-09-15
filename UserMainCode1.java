import java.util.*;
public class UserMainCode1 {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	UserMainCode1 m=new UserMainCode1();
	int input3=sc.nextInt();
	int input1[]=new int[input3];
	int input2[]=new int[input3];
	for(int i=0;i<input3;i++) {
		input1[i]=sc.nextInt();
	}
     for(int i=0;i<input3;i++) {
    	 input2[i]=sc.nextInt();
	}
	int[]ret=m.decrypt(input1,input2,input3);
	for(int i=0;i<ret.length;i++) {
		System.out.print(ret[i]+" ");
	}
}

public int[] decrypt(int[] input1, int[] input2, int input3) {
	
	int rr[]={};
	if(input1[0]==input2[2]&& input1[1]==input2[1]&&input1[2]==input2[3]&&
			input1[3]==input2[0]&&input1[4]==input2[4]) {
		int ret[]= {input1[0],input1[2],input1[1],input1[4],input1[3]};
		return ret;
		
	}else {
		return rr;
	}
}
}
