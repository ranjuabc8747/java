package Other;

import org.testng.annotations.Test;

public class IntegerPalendrome {
	@Test
	public void intPal()
	{
		int num=121;
		int rev=0;
		int temp=num;
		
		while(num>0)
		{
			int rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		if(temp==rev)
		{
			System.out.println("palendrome");
		}
		else
		{
			System.out.println("not a palendrome");
		}
	}

}
