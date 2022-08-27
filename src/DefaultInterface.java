package src;

//Abstract class->define and declare
//interface -> declare -> 1.7
//1.8 can define methods in interface
interface Demo
{
	int i =18;
	void abc(); //declare and abstract method
	default void show() //define using keyword default
	{
		System.out.println("in Demo show");
	}
	static void shows()
	{
		System.out.println("static method");
	}
}

interface MyDemo
{
	default void show() 
	{
		System.out.println("in MyDemo show");
	}
}
class DemoImp implements Demo, MyDemo
{
	public void abc()
	{
		//i=9; cannot change the i value, as declaring in an interface i becomes constant
		System.out.println("in abc");
	}
	
	public void show1() 
	{
		System.out.println("in new show");
	}

	@Override
	public void show() 
	{
		Demo.super.show();
		MyDemo.super.show();
	}
	

	
}
public class DefaultInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj = new DemoImp();
		obj.abc();
		obj.show();
		Demo.shows();
	}

}
