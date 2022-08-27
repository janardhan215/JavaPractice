package src;
/*Inner class
 *   Static class
 *   Member class
 *   Abstract class
 *  
 *  */

class Outer
{
	int a;
	public void show()
	{
		
	}
	
	class Inner //Member class
	{
		public void display()
		{
			System.out.println("inner In Display");
		}
	}
	
	public static void show1()
	{
		
	}
	
	static class  StaticInner //Static class
	{
		public void display()
		{
			System.out.println("static inner In Display");
		}
	}
}

public class InnerDemo 
{
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Outer obj = new Outer();
		obj.show();
		
		Outer.Inner obj1=obj.new Inner();
		obj1.display();
		
		Outer.StaticInner obj2=new Outer.StaticInner();
		obj2.display();
		
	}

}
