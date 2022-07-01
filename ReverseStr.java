package pka;

public class ReverseStr {
	public static void main(String[] args) {
		
		String s="sri karan";
		int len=s.length();
		char ch[]=s.toCharArray();
		char ch1[]=new char[len];
		
		
	for(int i=0;i<len;i++)
	{
		ch1[len-i-1]=ch[i];
	}
	for(int j=0;j<len;j++)
	{
		System.out.print(ch1[j]);
	}
	int p=1;
	System.out.println();
	for(int i=0;i<len;i++)
	{
		if(ch[i]==ch1[i])
		{
			p=0;
		}
		else
		{
			p=1;
		}
	}
	if(p==0)
	{
		System.out.println("palindrome");
	}
	else
		System.out.println("not a palindrome");
		
		
		
		
	}

}
