package src;



public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5; //primiteive Datatype
		Integer ii = new Integer(i); //Boxing wraping
		System.out.println(ii);
		int j=ii.intValue(); //Unboxing unWarapping
		
		System.out.println(j);
		Integer value=i; //Auto boxing
		
		int k=value; //auto unboxing
		System.out.println(value);
		System.out.println(k);
		
		String a="123";
		k=Integer.parseInt(a); //parseint is a static method , so require class name
		System.out.println(k);
		
	}

}
