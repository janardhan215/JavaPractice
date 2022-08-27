package src;

//abstract class Writer
//By defualt interface methods are public abstract
interface Writer
{
	void write();
	
}
class Pen implements Writer
{
	public void write()
	{
		System.out.println("I am Pen");
	}
}

class Pencil implements Writer
{
	public void write()
	{
		System.out.println("I am Pencil");
	}
}

class Kit
{
	public void doSomething(Writer p)
	{
		p.write();
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Writer p = new Pen();
		Writer pc = new Pencil();
		Kit k = new Kit();
		k.doSomething(p);
		k.doSomething(pc);

	}

}
