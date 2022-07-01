package pka;



public class ExampleOfStatic {
	int id;
	String name;
	public static String college="srec";
	ExampleOfStatic(int i,String n)
	{
		id=i;
		name=n;
	}
	public void display()
	{
		System.out.println(id+" "+name+" "+college);
	}

public static void main(String[] args) {
	
	ExampleOfStatic es=new ExampleOfStatic(123,"zip");
	ExampleOfStatic es1=new ExampleOfStatic(455,"gh");
	es.display();
	es1.display();
}
}
