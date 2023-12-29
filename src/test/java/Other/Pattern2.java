package Other;

import org.testng.annotations.Test;

public class Pattern2 {
	// * * * * *
	// * * * *
	// * * *
	// * *
	// *
	@Test
	public void pattern3()
	{
		int n=5;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i==j||i<=j)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	@Test
	public void pattern4()
	{
//		     *
//		   * *
//		 * * *
//	   * * * *
//	 * * * * *
		
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	@Test
	public void pattern5()
	{
		// * * * * *
		//   * * * *
		//     * * *
		//       * * 
		//         *
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	@Test
	public void pattern7()
	{
//		   *
//		  * *
//		 * * *
//		* * * *
//	   * * * * *
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
		
		
		

