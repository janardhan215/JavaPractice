package src;

//When we use final as variable it becomes constant
//When we use final as class, it cannot be extended to another class
//when we use final as method, it cannot be overridden again
class Aa
{
	final int i=0; //you cannot change the value if we use final keyword
	public Aa()
	{
		//i=10;
	}
}

 class Bb
{
	public final void  show()
	{
		System.out.println("in B show");
	}
}

class Cc extends Bb //B class cant be extended when we use final
{
	/*
	 * public void show() 
	 * { System.out.println("in C show"); }
	 */
	public  void  show1()
	{
		System.out.println("in B show");
	}
	
	
}

public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aa obj = new Aa();
		Bb obj1 = new Bb();
		obj1.show();
		Cc obj2 = new Cc();
		obj2.show();

	}

}
