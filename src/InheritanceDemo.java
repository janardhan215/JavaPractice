//IS-A,HAS-A

class Cal //super, parent ,base
{
	public int add(int i, int j)
	{
		return i+j;
	}
}

class CalcAdv extends Cal //sub, class, derived
{
	/*
	 * public int add(int i, int j) { return i+j;
	 * 
	 * }
	 */

	public int sub(int i, int j)
	{
		return i-j;
	}
}

class CalcVeryAdv extends CalcAdv
{

	public int mul(int i, int j)
	{
		return i*j;
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal c1 = new Cal();
		int result=c1.add(5,4);
		System.out.println(result);
		
		CalcVeryAdv c2 = new CalcVeryAdv();
		int addres=c2.add(5,4);
		int subres=c2.sub(5,4);
		int mulres=c2.mul(5,4);
		System.out.println(subres);
		System.out.println(addres);
		System.out.println(mulres);
	}

}
