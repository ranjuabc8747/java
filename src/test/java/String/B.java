package String;

import java.util.TreeSet;

import org.testng.annotations.Test;

public class B {
	@Test
	public void test2() {
		int []a= {5,2,7,9,2,4,3,3,1};
		TreeSet<Integer> set = new TreeSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		int count=3;
		for(Integer b:set)
		{
			if(count>0)
			{
				System.out.println(b);
				count--;
			}
		}
	}

}
