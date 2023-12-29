package Arrays;

import org.testng.annotations.Test;

public class MaximumNumbers {
	@Test
	public void firstMaximumNumber()
	{
		int[] a= {10,5,15,3,7,25,25};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]<a[j])
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}	
			}}
			System.out.println("the first max number is "+a[0]);
		
	}
	@Test
	public void first3MaxmumNumber()
	{
		int[] a= {10,5,15,3,7,25};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]<a[j])
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
		
		
	}	
			}}
		int sum=0;
		for(int i=0;i<3;i++)
		{
			sum=sum+a[i];
		}
			System.out.println("the sum of first 3 max number is "+sum);
		
	}
	@Test
	public void first3maxmultipleNumber()
	{
		int[] a= {10,5,15,3,7,25,25};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]<a[j])
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}	
			}}
		int prod=1;
		for(int i=0;i<3;i++)
		{
			prod=prod*a[i];
		}
			System.out.println("the multiple of first 3 max number is " +prod);
		
	}

}
