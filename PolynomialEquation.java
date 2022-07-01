package pka;

import java.util.Scanner;

public class PolynomialEquation {

	public static void main(String[] args) {
	  double a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values of a");
		a=sc.nextDouble();
		
		System.out.println("enter the values of b");
		b=sc.nextDouble();
		System.out.println("enter the values of c");
		c=sc.nextDouble();
		
		double d=(b*b-4.0*a*c);
		
		if(d>0)
		{
			double d1=(-b+(Math.pow(d, (0.5))))/2*a;
			double d2=(-b-(Math.pow(d, (0.5))))/2*a;
			System.out.println("roots are"+d1+"and"+d1);
		}
		else if(d==0)
		{
			double d1=-b/2*a;
			System.out.println("roots are"+d1);
		}
		else
		System.out.println("roots are not real");
		

	}
}
