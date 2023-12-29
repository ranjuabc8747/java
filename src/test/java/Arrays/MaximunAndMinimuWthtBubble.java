package Arrays;

import org.testng.annotations.Test;

public class MaximunAndMinimuWthtBubble {
	@Test
	public void firstand2ndMaximumNumber()
	{
		int[] a= {10,5,15,3,7,25,25};
		int f1stmax=a[0];
		int f2ndmax=a[0];
		for(int i=0;i<a.length;i++)
		{
			if( a[i]>f1stmax)
			{
				f2ndmax=f1stmax;
				f1stmax=a[i];
			}
			else if(a[i]>f2ndmax) {
				f2ndmax=a[i];
			}
					}
		System.out.println("1st and 2nd max number is"+ f1stmax+" "+f2ndmax);
		}
		@Test
		public void firstand2ndMinimumNumber()
		{
			int[] a= {10,5,15,3,3,25};
			int f1stmin=a[0];
			int f2ndmin=a[0];
			for(int i=0;i<a.length;i++)
			{
				if( a[i]<f1stmin)
				{
					f2ndmin=f1stmin;
					f1stmin=a[i];
				}
				else if(a[i]<f2ndmin) {
					f2ndmin=a[i];
				}
						}
			System.out.println("1st and 2nd max number is " + f1stmin+" "+f2ndmin);
			}
		
		
		

}
