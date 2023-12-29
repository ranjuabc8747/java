package map;

public class Stockmarket {

	public static void main(String[] args) {
		int [] a= {6,15,9,13,7};
		//int[] a= {17,9,8,6,3};
		
	int	b=print( a);
	System.out.println(b);
	
	}
		
	
	public static int print(int[] a)
	{
		int min=a[0];
		int maxdiff=a[1]-a[0];
		
	
		for(int i=1;i<a.length;i++)
		{
			if(a[i]-min>maxdiff)
			{
				maxdiff=a[i]-min;
			}
			if(a[i]<min)
			{
				min=a[i];
			}
			
		
	}
		if(maxdiff>0)
		{
		return maxdiff;
		}
		else
		{
			return 0;
		}

	}
}


