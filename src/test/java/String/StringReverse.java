package String;

import org.testng.annotations.Test;

public class StringReverse {
@Test
public void stringReverse()
{
	String s="I am from Bangalore";
	String[] s1 = s.split(" ");
	
	
	for(int i=s1.length-1;i>=0;i--)
	{
		System.out.print(s1[i]+" ");
	}
}
}
