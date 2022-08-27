package src;
abstract class Human //when we use abstract object cant be created
{
	public abstract void eat();
	
	public  void walk()
	{
		
	}
}

class Man extends Human //Concrete class
{
	public void eat()
	{
		
	}
}

class Printer
{
	public void show(Integer i)
	{
		System.out.println(i);
	}
	
	public void show(Double i)
	{
		System.out.println(i);
	}
	
	public void show1(Number i)
	{
		System.out.println(i);
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Human obj=new Human();
		//Human obj = new Man();
		Printer obj = new Printer();
		obj.show(5.5);
		obj.show1(5.6);
		
	}

}
