package Other;

import org.testng.annotations.Test;

public class PrintNos {
	@Test
	public void print()
	{
		//1 3 7 15 31 63
		int a=1;
		
		while(a<65)
		{
			System.out.println(a);
			a=a*2+1;
					}
		
	}
	@Test
	public void print2()
	{
		//1 3 7 15 31 63
		int a=5;
		int n=1;
		System.out.println(n);
		for(int i=1;i<a;i++)
		{
		n=(n*2)+1;
			System.out.println(n);
					}
		
	}

}
