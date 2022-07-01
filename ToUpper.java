package pka;

public class ToUpper {
public static void main(String[] args) {
	
	String s="AbCEdssaaA";
	
	int len=s.length();
	char x[]=s.toCharArray();
	
	for(int i=0;i<len;i++)
	{
		if((x[i]>=65) &&(x[i]<=90))
		{
			x[i]=(char)(x[i]+32);
		}
		else if((x[i]>=97) &&(x[i]<=122))
		{
			x[i]=(char) (x[i]-32);
		}
	}
	for(int j=0;j<len;j++)
	{
		System.out.print(x[j]);
	}
	}
}
