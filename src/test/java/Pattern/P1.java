package Pattern;

import org.testng.annotations.Test;

public class P1 {
	@Test
	public void test1()
	{
//	int a=1;
	for(int i=0;i<5;i++)
	{
		char a='A';
		for (int j=0;j<5;j++)
		{
			System.out.print(a+" ");
			a++;
			
		}
		//a++;
		System.out.println(" ");
	}

}
	@Test
	public void test2()
	{
		char a='A';
		int n=5;
		for(int i=0;i<5;i++)
		{
			//char a='A';
			
			for (int j=0;j<5;j++)
			{
				if(i<=j)
				{
				System.out.print(a+" ");
				a++;
				
			}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
	}
		
	
