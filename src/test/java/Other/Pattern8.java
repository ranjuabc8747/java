package Other;

import org.testng.annotations.Test;

public class Pattern8 {
@Test
public void pattern88() {
//	* * * * *
//	 * * * *
//	  * * *
//	   * *
//	    *
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(int j=i;j<=n;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
@Test
public void pattern9()
{
//	1 1 1 1 1 
//	2 2 2 2 2 
//	3 3 3 3 3 
//	4 4 4 4 4 
//	5 5 5 5 5 
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
@Test
public void pattern10()
{
//	1 2 3 4 5 
//	1 2 3 4 5 
//	1 2 3 4 5 
//	1 2 3 4 5 
//	1 2 3 4 5 
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
}

@Test
public void pattern11()
{
/// 1
//	2 2
//	3 3 3
//	4 4 4 4
//	5 5 5 5 5
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
//5
//5 4
//5 4 3
//5 4 3 2 
//5 4 3 2 1
@Test
public void pattern12() {
	int n=5;
	for(int i=1;i<=n;i++)
	{
		int k=5;
		for(int j=1;j<=i;j++)
		{
			System.out.print(k--+" ");
		}
		System.out.println();
	}
	
}
//    1
//   2 2
//  3 3 3
// 4 4 4 4
//5 5 5 5 5
@Test
public void pattern13() {
	int n=5;
	for(int i=1;i<=n;i++)
	{
		
		for(int j=i;j<=n;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
}
}

