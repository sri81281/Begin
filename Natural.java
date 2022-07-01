package pka;

public class Natural {
public static void main(String[] args) {
	
	int sum=0;
	int count=0;
	for(int i=1;i<=100;i++)
	{
		count++;
		sum=sum+i;
		
	}
	System.out.println("sum of all natural numbers :"+sum);
	System.out.println("last digit of the sum"+count);
}
}
