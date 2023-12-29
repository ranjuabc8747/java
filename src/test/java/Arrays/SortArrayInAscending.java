package Arrays;

import org.testng.annotations.Test;
public class SortArrayInAscending {
	@Test
	public void sortanarrayinAscendingorder()
	{
		int[] a= {10,5,15,3,7,25};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]>a[j])
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}
			}
		
	System.out.println(a[i]);
		}
	}
		@Test
		public void sortanarrayinDescendingorder()
		{
			int[] a= {10,5,15,3,7,25,3};
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
				if(a[i]>a[j])
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
		}
				}
			}
			for(int i=0;i<a.length;i++)
			{
					System.out.print(a[i]+" ");
			}
		}
}
		




