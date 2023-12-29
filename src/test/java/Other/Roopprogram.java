package Other;

import org.testng.annotations.Test;

public class Roopprogram {
	@Test
	public void test1()
		{
			int[] a= {7,10,14,17,20};
			int min=a[0]+1;
			int max=a[a.length-1];
			for(int i=min;i<max;i++)
			{
				if(i!=a[i])
				{
					System.out.println(i);
				}
		}
	}

}
