package Other;

import org.testng.annotations.Test;

public class PrimeBtwm1to30 {
	@Test
	public void prime()
	{
		
		for(int i=1;i<=30;i++)
		{
			int num=i;
			int count=0;
			int a=2;
			while(a<=num/2)
		{
			if(num%a==0)
				{
					count++;
					
				}
				a++;
				
			}
		if(count==0)
			{
				System.out.println(num+" ");
			}
		
	}}
}
	


