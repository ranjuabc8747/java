package String;

import org.testng.annotations.Test;

public class CountNoOfVowelsInAString {
	@Test
	public void test()
	{
		String s="software";
		int vowel=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				vowel++;
				System.out.println(s.charAt(i));
			}
		}
		System.out.println(vowel);
	}
	

}
