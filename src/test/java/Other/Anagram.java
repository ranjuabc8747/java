package Other;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Anagram {
	@Test
	public void test()
	{
		int a=12345;
		int b=53241;
		String s1=Integer.toString(a);
		String s2=Integer.toString(b);

	char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(String.valueOf(c1).equals(String.valueOf(c2)))
		{
			System.out.println("the given numbers are anagram");
			
		}
		else
		{
			System.out.println("not an anagram");
		}
		
	}
	@Test
	public void test2()
	{
		String STR ="java234str789";
		 String[] str = STR.replaceAll("[^0-9]", " " ).trim().split(" ");
	//	System.out.println(str);
	}

}
