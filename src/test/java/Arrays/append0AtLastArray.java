package Arrays;

import org.testng.annotations.Test;

public class append0AtLastArray {
	@Test
	public void append()
	{
		int[]a= {4,0,0,2,6,0,7,0,9};//o/p :4 2 6 0 0 0 0
		int num=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==num)
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				
						}
			}
			
		
		System.out.println(a[i]);
	}
	}


// 0 first and all numbers last
@Test
public void append0AtFirstInArray()
{
	int[]a= {4,0,0,2,6,0,0};
	int[]b=new int[a.length];
	int m=0;
	int n=a.length-1;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==0)//a[i]!=0 to get 0 s at last
		{
			b[m]=a[i];
			m++;
		}
		else
		{
			b[n]=a[i];
			n--;
		}
	}
	for(int i=0;i<b.length;i++)
	{
		System.out.println(b[i]+" ");
		}
	}
}
	


