package map;

import java.util.Iterator;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class OccuranceUsingCollection {
	@Test
	public void collections()
	{
	String s="TestyYantraa";
	String s1 = s.toLowerCase();
	LinkedHashSet<Character> set = new LinkedHashSet<Character>();

for(int i=0;i<s1.length();i++)
{
	set.add(s1.charAt(i));
}
	for(Character ch:set)
	{
		int count=0;
	
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==ch) 
			{
				count++;
				
			}
			
		}
		System.out.println(ch+" "+count);
	}

}
}
