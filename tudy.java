package pka;

public class tudy {
public static void main(String[] args) {
	String s="sri karan";
	int len=s.length();
	char x[]=s.toCharArray();
	char ch[]=new char[len];
	
	for(int i=0;i<len;i++)
	{
		ch[len-i-1]=x[i];
		
	}
	int check=0;
	for(int i=0;i<len;i++)
	{
		if(ch[i]==x[i])
		{
			check=1;
		}
		else {
			check=0;
		}
	}
	if(check==1)
	{
		System.out.println("palindrome");
	}
	else
		System.out.println("not a palindrome");
	
}
}
