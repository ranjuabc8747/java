package String;

import org.testng.annotations.Test;

public class StringPalindrome {
@Test
public void stringPalendrom()
{
	String s="gadag";
	String rev="";
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
	if(s.equalsIgnoreCase(rev))
	{
		System.out.println("palindome");
	}
	else
	{
		System.out.println("not a palindrome");
	}
	
}
}
