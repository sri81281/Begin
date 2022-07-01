package pka;

public class StringOfOddLength {
	public static void main(String[] args) {
		String s="12345";
				
		int c=s.length();
		char ch[][]=new char[c][c];
		
		for(int i=0;i<c;i++)
		
			ch[i][i]=s.charAt(i);
		
		
		for(int i=(c-1),j=0;j<c;j++,i--)
		
			ch[i][j]=s.charAt(j);
		
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<c;j++) {
			
				System.out.print(ch[i][j]);
			}
				System.out.println();
			
		}
	}

}
