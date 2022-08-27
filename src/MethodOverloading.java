package src;
//Method Overloading

class Casio
{
	public void add(int i , int j)
	{
		System.out.println(i+j);
	}
	
	public void add(int i , int j, int k)
	{
		System.out.println(i+j+k);
	}
	public Casio(int i , int j) {
		
		System.out.println(i+j);
	}
	
	public Casio(int i , int j, int k) {
		System.out.println(i+j+k);
	}
	public Casio() {
		System.out.println("Hello I am the constructor");
	}
}
public class MethodOverloading {
	public static void main(String[] args)
	{
		Casio obj = new Casio();
		Casio obj1 = new Casio(2,2);
		Casio obj2 = new Casio(2,6,10);
		obj.add(1,3);
		obj.add(5,2,11);
	}

}
