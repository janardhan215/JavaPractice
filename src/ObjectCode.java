package src;
class Calc
{
	int num1;
	int num2;
	int result;
	
	 public void perform()
	{
		result=num1+num2;
	}
	
	 //Constructor is a member method
	 //Same name as class name
	 //It wont return anything
	 //It will allocate memory
	 
	  public  Calc()
	  {
		  num1=2;
		  num2=6;
		  System.out.println("Hi");
	  }
	  
	  public Calc(int k)
	  {
		  num1=k;
		  System.out.println("hello");
	  }
	
}

public class ObjectCode 
{
	public static void main(String[] args)
	{
		Calc obj = new Calc();
		obj.num1=3;
		obj.num2=4;
		obj.perform();
		System.out.println(obj.result);
	}
}
