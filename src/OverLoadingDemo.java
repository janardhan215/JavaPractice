class C
{
	int i;
	
	public void show()
	{
		i=18;
		System.out.println(i+" in C");
	}
}

class D extends  C  //Child method override existing parent method
{
	int i;
	//@Override  //instead of logical error, method helps in getting compile error
	public void show()
	{
		i=8;   //super is used to denote parent class data(eg:method, variable)
		super.show();
		System.out.println(i+" in D "+super.i);
	}
}

public class OverLoadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D obj1=new D();
		obj1.show();
	}

}
