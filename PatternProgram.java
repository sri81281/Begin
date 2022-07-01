package pka;



public class PatternProgram {
	
	public static void main(String[] args) {
		char ch='E';
				
		
		int row=6;
		
		while(ch!='@')
		{
			
			for(int i=0;i<row-1;i++)
			{
				
				for(int j=0;j<row-i;j++)
				{
					System.out.print(ch);
				}
				System.out.println();
				ch--;
			}
			
		}
	}

}
