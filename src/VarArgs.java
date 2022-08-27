class Var
{
	public int add(int ... o) //variable length args
	{
		int sum=0;
		for(int i : o)
		{
			sum+=i;
		}
		return sum;
	}
}

public class VarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Var obj=new Var();
		System.out.println(obj.add(4,5,7));
	}

}
