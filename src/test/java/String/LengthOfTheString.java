package String;

import org.testng.annotations.Test;

public class LengthOfTheString {
	@Test
	public void lengthOfstring()
	{
		String s="testyantra";
		System.out.println(s.length());
	}


@Test
public void withoutUsingLengthMethod()
{
	String s="testyantra";	
	char[] s1 = s.toCharArray();
	int count=0;
	for( char a:s1)
	{
		count++;
	}
	System.out.println(count);
}
//using While loop
@Test
public void count()
{
	String s="testyantr";	
	int i=0;
	while(true)
	{
		try {
			s.charAt(i);// t e ....
			i++;// 1 2 3 4
		}
		catch(Exception e)
		{
			System.out.println(i);
			break;
		}
	}
}
}
