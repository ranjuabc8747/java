package Other;

import org.testng.annotations.Test;

public class Practice {
	@Test
	public void test1()
	{
		String s="Bangalore is a good place";
		for(int i=s.length()-1;i>=0;i--)
		{
		System.out.print(s.charAt(i));
		}

	}
	@Test
	public void test2()
	{
		String s="Bangalore is a good place";
		String[] s1=s.split("\\s+");
		for(int i=0;i<s1.length;i++)
		{
			String s2=s1[i];
		
		for(int j=s2.length()-1;j>=0;j--)
		{
		System.out.print(s2.charAt(j));
		}
		System.out.print(" ");

	}

	}
	@Test
	public void test3()
	{
		String s="Bangalore is a good place";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);

	}
	@Test
public void test4()
{
		String s="Testers";
		String s1 = s.toLowerCase();
		for(int i=0;i<s1.length();i++)
			
		{
			for(int j=0;j<s1.length();j++)
			{
				int count=0;
			
				if(s1.charAt(i)==s1.charAt(j))
				{
					count++;
					System.out.println(count);
					System.out.print(s1.charAt(j));
				}
			}
		}
}
}
		