package pka;

public class Palindrome {
public static void main(String[] args) {
	int num=152;
	int e=num;
	int temp=0;
	int rem;
	
	while(num!=0) {
		
		
		rem=num%10;
		temp=temp*10+rem;
		num=num/10;
	}
	System.out.println(temp);
   if(e==temp)
   {
	   System.out.println("number is palindrome");
   }
   else 
	   System.out.println("not palindrome");
}
}
