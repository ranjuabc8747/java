package Other;

import org.testng.annotations.Test;

public class Interview2 {
	@Test
	public void test1()
	{
		String s="abcabcjavaabseleniumabb";
		//o/p {"",cjava,selenium,b}
		String[] ar = s.split("ab");
		System.out.println(ar.length);
		for(int i=0;i<ar.length;i++)
		{
		System.out.println(ar[i]+":"+ar[i].length());
	}

}
}
