package src;
class Calci
{
	int num1;
	int num2;
	int result;
	
	//Default constructor
	public Calci()
	{
		num1=5;
		num2=8;
		System.out.println("hello i am the constructor");
	}
	
	//Parameterized Constructor
	public Calci(int n)
	{
		num1=n;
		num2=n;
		System.out.println(num1+num2);
	}
	
	public Calci(double n, int k)
	{
		num1=(int)n;
		num2=k;
		System.out.println(num1+num2);
	}
	
	
}


public class ObjectCodeTwo {

	public static void main(String[] args)
	{
		Calci obj= new Calci();
		Calci obj1= new Calci(5);
		Calci obj2= new Calci(5.7,7);
		System.out.println(obj.num1);
	}
}
