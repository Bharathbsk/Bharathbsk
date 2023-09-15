import java.util.*;
public class UserId {
     public static void main(String[] args) {
    	 UserId u=new UserId();
    	 Scanner sc=new Scanner(System.in);
    	 String fn=sc.next();
    	 String ln=sc.next();
    	 int pin=sc.nextInt();
    	 int n=sc.nextInt();
    	 String ret=u.userIdGeneration(fn,ln,pin,n);
    	 System.out.println(ret);
	}

	public String userIdGeneration(String input1, String input2, int input3, int input4) {
		String id="";
		String nm="";
		String num="";
		if(input1.length()>input2.length()) {
			
		}else if(input1.length()<input2.length()) {
			
		}else if(input1.length()==input2.length()) {
			
		}
		String rr=""+input3;
		rr=""+rr.charAt(input4-1);
		String kk="";
		for(int i=0;i<rr.length();i++) {
			kk=rr.charAt(i)+kk;
		}
		rr=""+kk.charAt(input4-1);
		
		return id+nm+num;
	}
}
