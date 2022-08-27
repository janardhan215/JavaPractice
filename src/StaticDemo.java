package src;
class Emp
{
	int eid;
	int salary;
	static String ceo;//it will be same for all the objects
	
	
	static // when you load a class
	{
		ceo="Jai";
		System.out.println("in class jai");
	}
	
	static // when you load a class
	{
		ceo="Balayya";
		System.out.println("in class Balayya");
	}
	public void show() {
		System.out.println(eid+":"+salary+":"+ceo);
		System.out.println("in constructor");
	}
	
}

public class StaticDemo {
	 int j=0;
	 static int k=0; //only static variables will be accessible in static method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//j=5;
		k=5;
		Emp Jana=new Emp();
		Jana.eid=8;
		Jana.salary=1000;
		Jana.ceo="Boss";
		
		Emp Sai= new Emp();
		Sai.eid=4;
		Sai.salary=100;
		Sai.ceo="Bosss";
		Jana.show();
		Sai.show();
		System.out.println("hI");
	}
}

