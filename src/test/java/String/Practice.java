package String;

import org.testng.annotations.Test;

public class Practice {
	@Test
	public void test1()
	{
		String s="I am From Bangalore";
		String s1 = s.toLowerCase();
		String[] s2 = s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			for(int j=0;j<s2.length;j++)
			{
				
				if(s2[i]==s2[j])
				{
					System.out.println("duplicate found+s2[i]");
					
				}
				else
				{
					System.out.println("no duplicates");
				}
			}
		}
		
	}

}
