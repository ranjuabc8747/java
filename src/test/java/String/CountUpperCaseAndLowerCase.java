package String;

import org.testng.annotations.Test;

public class CountUpperCaseAndLowerCase {
	@Test
	public void count()
	{
		String s="BaNgALorE";
		
	
	int up=0;
	int low=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>='A' && s.charAt(i)<='Z')
		{
			up++;
		}
		else
		{
			low++;
		}
	}
		System.out.println(up);
		System.out.println(low);
	}
	


}

