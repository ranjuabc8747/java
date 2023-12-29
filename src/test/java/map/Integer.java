package map;

import java.util.HashMap;

import org.testng.annotations.Test;

public class Integer {
	@Test
	public void test1()
	{
		int x=12134;
		while(x>0)
		{
			int n=x%10;
			HashMap<Integer, Integer> hs=new HashMap<Integer,Integer>();
			if(hs.containsKey(n))
			{
				hs.put(n,n+1);
			}
			x=x/10;
			
		}
	}

}
