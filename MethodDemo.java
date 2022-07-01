package pka;

public class MethodDemo {

	public int  check()
	{
		int i=0;
		for( i=0;i<2;i++)
		{
			if(i==2)
			{
				System.out.println("s");
				return i;
			}	
		}
		System.out.println("karan");
		return i;
		
	}
	public static void main(String[] args) {
		System.out.println();
		new MethodDemo().check();
		int x=5;
		System.out.println(++x - x++ + -x);
		
	}
	
	
}
