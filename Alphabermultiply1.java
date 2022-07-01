package pka;

public class Alphabermultiply1 {
public static void main(String[] args) {
	
	String s="testr234";
	String s1="234";
	int flag=0;
	int signal=1;
	for(int i=0;i<s.length()-s1.length();i++)
	{
		 flag=1;
		 for(int j=0;j<s1.length();j++,i++)
		 {
			 if(s1.charAt(j)!=s.charAt(i))
			 {
				 flag=0;
				 break;
			 }
			 
		 }
		 if(flag==1)
		 {
			 signal=0;
			 System.out.println(i-s1.length());
		 }
		 
	}
	if(signal==1)
	{
		System.out.println("-1");
	}
	
	
}
}
