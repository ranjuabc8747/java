package Arrays;

import org.testng.annotations.Test;

public class MaxAndMinHvngDuplicates {
	@Test
	public void max()
	{
		int[] a= {0,1,5,4};
		//int[] a= {1,2,3,4,5};
		int fmin=a[0];// 0 0
		int smin=a[0];// 0 1
		for(int i=0;i<a.length;i++)
		{
			// i=0 0<5t a[i]=0
			// i=1 1<5t a[i]=1
			if(a[i]<=fmin)//0<=0t,1<=0f
			{
				if(a[i]!=fmin)//0!=0f
				{
					smin=fmin;
				}
				fmin=a[i];
			}
			else if(smin==fmin || a[i]<smin)//0==0t||0<0f,0==0t||1<0f
			{
				smin=a[i];// 0,1
			}
		}
		System.out.println(fmin+" "+smin);
	}

}
