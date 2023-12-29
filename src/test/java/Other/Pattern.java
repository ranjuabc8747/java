package Other;

import org.testng.annotations.Test;

public class Pattern {
@Test
public void pattern()
{
//	*
//	* *
//	* * *  
//	* * * *
//	* * * * *
	
	int n=5;
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
			if(i==j||i<=j)
			{
				System.out.print("* ");
			}
			
		}
		System.out.println();
	}
}
@Test
public void pattern2()
{
//	* * * * *
//	* * * * *
//	* * * * *
//	* * * * *
//	* * * * *
	
	
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
			
			{
				System.out.print("* ");
			}
			
		}
		System.out.println();
	}
}
@Test
public void pattern1again() {
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			
			{
				System.out.print("* ");
			}
			
		}
		System.out.println();
	}
	
}
}

