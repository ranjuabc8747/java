package Arrays;

import org.testng.annotations.Test;

public class WithoutBubblesortFirstMinimumNumber {
	@Test
	public void minimumNumber()
	{
	int[] a= {10,5,25,3,7};	
	int fmin=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(fmin>a[i])
		{
			fmin=a[i];
		}
	}
		System.out.println(fmin);
	}
	@Test
	public void maximumNumber()
	{
	int[] a= {30,10,5,25,3,7,25};	
	int fmax=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(fmax<a[i])
		{
			fmax=a[i];
		}
	}
		System.out.println(fmax);
	}
	
	
	

}
