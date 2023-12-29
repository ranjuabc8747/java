package String;

import org.testng.annotations.Test;

public class reverse {
@Test

	public void test1()
	{
		String s="Manoj";
		for(int i=0;i<s.length();i++)
		{
			String s2=s;
			for(int j=s2.length()-1;j>=3;j--)
			{
				System.out.print(s2.charAt(i));
			}
		
			System.out.print(" ");
	}
}
}

