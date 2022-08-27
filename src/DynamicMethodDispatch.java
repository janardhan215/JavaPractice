package src;

class E
{
	int i;
	
	public void show()
	{
		i=18;
		System.out.println(i+" in E");
	}
}

class F extends  E  //Child method override existing parent method
{
	int i;
	//@Override  //instead of logical error, method helps in getting compile error
	public void show()
	{
		i=8;   //super is used to denote parent class data(eg:method, variable)
		//super.show();
		System.out.println(i+" in F");
	}
	
	public void config()
	{
		System.out.println("in c");
	}
}

class G extends E
{	
	public void show()
	{
		
		System.out.println(" in G");
	}
}

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E obj1=new F(); //even though E is the reference here,the object is of F method, so show in class F will be executed
		obj1.show(); //run time polymorphism
		///obj1.config(); //The method config is undefined for the type E
		obj1 = new G(); //Dynamic method dispatch
		obj1.show();
	}

}
