package pka;

interface Show
{
	
	default void display()
	{
		print();
	}
	private void print() {
		System.out.println("karan");
	}
	
}

public class ExecuteDemo implements Show{
public static void main(String[] args) {
	ExecuteDemo obj=new ExecuteDemo();
	obj.display();
	
			 
		
}
}
