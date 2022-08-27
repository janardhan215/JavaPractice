package src;

class Ano 
{
	public void show()
	{
		System.out.println("anything");
	}
}

public class AnonymousExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ano obj = new Ano()
				{
					public void show()
					{
						System.out.println("Anonymous");
					}
				};
		obj.show();
	}

}
