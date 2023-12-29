package String;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class CountNumberOfDuplicatesInString {
	@Test
	public void countDuplicates()
	{
		String s="Testerss";
		String s1 = s.toLowerCase();
	   LinkedHashSet<Character> l = new	LinkedHashSet<Character>();

	for(int i=0;i<s1.length();i++)
	{
		l.add(s1.charAt(i));
	}
	System.out.println(l);
	for(Character a:l)
	{
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
		if(s1.charAt(i)==a)
		{
			count++;
		}
		}
		
		if(count>1 )
		{
			System.out.println(a+" "+ "is repeating "+count+" "+"times");
		}

}
	
	}
}
