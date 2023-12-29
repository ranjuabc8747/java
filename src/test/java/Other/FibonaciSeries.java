package Other;

import org.testng.annotations.Test;

public class FibonaciSeries {
	@Test
	public void fibonacci()
	{
		int fib1=0;
		int fib2=1;
		int fib3;
		System.out.println(fib1);
		System.out.println(fib2);
		for(int i=1;i<=5;i++)
		{
			fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
			System.out.println(fib3);
		}
	}

}
