package Other;

import org.testng.annotations.Test;

public class FindPrimeNosInArray {
	@Test
	public void prime()
	{
	int[] a= {4,5,2,3,6,8,9,11};
	
	for(int i=0;i<a.length;i++)
	{
		int num=a[i];
		int b=2;
		int count=0;
		while(b<=num/2)
		{
		
		if (num%b==0)
		{
			count++;
			
			}
		b++;
		}
	
	if(count==0)
	{
		
		System.out.println(num+" is a palendrome ");
	}

	}}}

