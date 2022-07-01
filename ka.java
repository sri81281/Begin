package pka;

public class ka {

	public static void main(String[] args) {
		String s="12345";
		
		int a=s.length();
		char[][] ch=new char [a][a];
		
		for(int i=0;i<a;i++)
			ch[i][i]=s.charAt(i);
		
		for(int i=a-1,j=0;j<a;j++,i--)
			ch[i][j]=s.charAt(i);
		
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				System.out.print(ch[i][j]+" ");
				
			}
			System.out.println();
		}
	}
}
