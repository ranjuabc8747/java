package Arrays;

import org.testng.annotations.Test;

public class AdditionOfTwoArrays {
@Test
public void add2Arrays()
{
	int[]a= {5,2,6,7,3};
	int[]b= {2,1,7,4,2};
	//{7,3,13,11,5}
	int[]c=new int[a.length];
	for(int i=0;i<c.length;i++)
	{
		c[i]=a[i]+b[i];
		
	}
	for(int i=0;i<c.length;i++)
	{
	System.out.println(c[i]+" ");
}
}


@Test
public void same()
{
	int[]a= {5,2,6,7,3};
	int[]b= {2,1,7,4,5,7,9};
	int length=a.length;
	if(a.length<b.length)
	{
		length=b.length;
	}
	for(int i=0;i<length;i++)
	{
		try {
			System.out.println(a[i]+b[i]+" ");
		}
		catch(Exception e)
		{
			if(a.length<b.length)
			{
				System.out.println(b[i]);
				
			}
			else
				System.out.println(a[i]);
		}
	}
}
}
