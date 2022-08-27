package src;

public class ExceptionDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			
			int b[]= null;
			b[6]=6;
			int a[]= new int[6];
			a[6]=7;
			int i=9/0;
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Error "+e);
		}
		
		catch(NullPointerException e)
		{
			System.err.println("error "+e);
		}
		catch(Exception e)
		{
			System.out.println("Error"+e);
		}
		
		finally
		{
		System.out.println("Bye");
		}
		
	}

}
