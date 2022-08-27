package src;



public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1D array
		int nums[] = new int[4];
		nums[0]=1;
		nums[1]=56;
		
		for(int i=0;i<4;i++)
		{
		
		System.out.println(nums[i]);
		}
		
		int nums1[] = {4,9,18,94};
		
		for(int i=0;i<4;i++)
		{
		
		System.out.println(nums1[i]);
		}
		
		//2 Dimensional array
		int a[]= {1,2,3,4};
		int b[]= {1,2,3,4};
		int c[]= {1,2,3,4};
		
		int d[][]= {
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4}
				
				};
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<d[i].length;j++)
			{
				System.out.print(" "+d[i][j]);
			}
			System.out.println();
		}
	}

}
