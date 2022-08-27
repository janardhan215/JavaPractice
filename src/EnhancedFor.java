package src;

public class EnhancedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
		
		for(int i=0;i<4;i++)
		{
			System.out.println(a[i]);
		}
		
		for(int k:a)
		{
			System.out.println(k);
		}
		
		//2 Dimensional array
				int e[]= {1,2,3,4};
				int b[]= {1,2,3,4};
				int c[]= {1,2,3,4};
				
				int d[][]= {
						{1,2,3,4},
						{1,2,3,4},
						{1,2,3,4}
						
						};
				for(int k[]:d)
				{
					for(int l:k)
					{
						System.out.print( ""+l);
					}
					System.out.println();
				}
	}

}
