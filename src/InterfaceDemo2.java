package src;

//Types of Interface
//1.normal
//2.Single abstract method --Funcitonal Interface in JAva 8 -Lambda Expression
//3.marker interface Eg: Serializable
//


interface Abc
{
	void show();
	
}

/*
 * class Implementor implements Abc { public void show() {
 * System.out.println("anything"); } }
 */
public class InterfaceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc obj = new Abc()
				{
			public void show()
			{
				System.out.println("anonymous");
			}
				};
		obj.show();
		
		Abc obj1 = () -> System.out.println("functional interface"); //only works for interface with one method
		obj1.show();
		
		Abc obj2 = () -> 
						{
							System.out.println("functional interface2");
							System.out.println("functional interface");
							
						};
		obj2.show();
	}

}
