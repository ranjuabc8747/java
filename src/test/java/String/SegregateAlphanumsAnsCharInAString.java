package String;

import org.testng.annotations.Test;

public class SegregateAlphanumsAnsCharInAString {
	@Test
	public void seggregate()
	{
		String s="a2B&c3/";
		char[] s1 = s.toCharArray();
		String alpha=" ";
		String num=" ";
		String sChar=" ";
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i]>='A' && s1[i]<='Z'||s1[i]>='a' && s1[i]<='z')
			{
				alpha=alpha+s1[i];
			}
			else if(s1[i]>='0' && s1[i]<='9')
			{
			num=num+s1[i];
			}
			else
			{
				sChar=sChar+s1[i];
			}
		}
		System.out.println(alpha+num+sChar);
	}

}