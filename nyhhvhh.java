package pka;

public class nyhhvhh {
	public static void main(String[] args) {
		int ar[]= {1,2,3,3,3,2,1,6,1};
		int len=ar.length;
		int n[]=new int[ar.length];
		int d=-1;
		for(int i=0;i<len;i++)
		{
			int count=1;
			for(int j=i+1;j<len;j++)
			{
				if(ar[i]==ar[j])
				{
					count++;
					n[j]=d;
				}
			}
			 
			
			
			if(n[i]!=d)
			{
				n[i]=count;
			}
		}
		for(int i=0;i<len;i++)
		{
			if(n[i]!=d)
			System.out.println(ar[i]+" "+n[i]);
		}
	}

}
