package Arrays;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class RemoveDuplicatesInArray {
	@Test
	public void test()
	{
		int [] a= {10,20,20,50,40,30};
		LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			ls.add(a[i]);
		}
		for(Integer b:ls)
		{
		System.out.println(b);
	}

}
}
