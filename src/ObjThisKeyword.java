package src;
class Calcii
{
	int num1;
	int num2;
	int result;
	
	public Calcii(int num1, int num2)
	
	{
		System.out.println(this.num1);
		System.out.println(this.num2);
		num1=num1;
		num2=num2;
		System.out.println(num1);
		System.out.println(num2);
		this.num1=num1; //this means  a current object
		this.num2=num2;
		//this.num1 & this.num2  are instance variables
		//num1 & num2 are local variables
		
	}
	
}
public class ObjThisKeyword {

	public static void main(String[] args)
	{
		Calcii obj= new Calcii(4,14);
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		
	}
	
}
