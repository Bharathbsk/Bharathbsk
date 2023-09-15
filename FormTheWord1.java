import java.util.Scanner;
public class FormTheWord1 {
     public static void main(String[] args) {
    	 FormTheWord1 m=new  FormTheWord1();
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String k=m.formTheWord(s);
		System.out.println(k);
	}

	public String formTheWord(String input1) {
		String arr[]=input1.split(":");
		String r="";
		for(int i=0;i<arr.length;i++) {
			if(arr[i].charAt(0)==arr[i].charAt(1)) {
				r=r+arr[i].charAt(0);
			}
			}
		String ret=r.toUpperCase();
		
		return ret;
	}
}
