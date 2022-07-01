package pka;

public class task {
public static void main(String[] args) {
	char ch='C';
	int row=4;
	while(ch!='@')
	{
		for(int i=row-1;i>0;i--)
		{
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
			}
			System.out.println();
			ch--;
		}
	}
}
}
