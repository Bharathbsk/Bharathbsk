import java.util.*;
public class TaxIBM {
     public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	     double d=sc.nextDouble();
	     double ret=calculateIncomeTax(d);
	     System.out.println(ret);
	}

	public static double calculateIncomeTax(double Taxable_Income) {
		double c1=0;
		if(Taxable_Income<=250000) {
			c1=0;
		}else if(Taxable_Income<=500000) {
			c1=(Taxable_Income-250000)/100;
		}else if(Taxable_Income<=750000) {
			c1=((Taxable_Income-250000)*0.10)+12500;
			
		}else if(Taxable_Income<=1000000) {
			c1=((Taxable_Income-250000)*0.15)+37500;
		}else if(Taxable_Income<=1250000) {
			c1=((Taxable_Income-250000)*0.20)+75000;
		}else if(Taxable_Income<=1500000) {
			c1=((Taxable_Income-250000)*0.25)+125000;
		}else {
			c1=((Taxable_Income-250000)*0.30)+187500;
		}
		
		if(Taxable_Income>500000000) {
			c1=c1+(37/100)*c1;
		}else if(Taxable_Income>200000000) {
			c1=c1+(25/100)*c1;
		}else if(Taxable_Income>100000000) {
			c1=c1+(15/100)*c1;
		}else if(Taxable_Income>50000000) {
			c1=c1+(10/100)*c1;
		}else {
			c1=c1+(4/100)*c1;
		}
		return c1;
	}
}
