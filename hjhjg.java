package pka;

public class hjhjg {
	public static void main(String[] args) {
		
		int num=5;
		
		int f1=1;
		for(int i=1;i<=num;i++)
		{
			f1=f1*i;
		}
		System.out.println(f1);
		
		int sum=0;
		while(num!=0)
		{
			int k=1;
			for(int i=1;i<=num;i++)
			{
				k=k*i;
			}
			sum=sum+k;
			num--; 
		}
		System.out.println(sum);
	}
	

}
