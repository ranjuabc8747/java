package String;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class PositionOfEachCharInReverse {
	@Test
	public void test()
	{
	
	String s="Tester";
	String s1 = s.toLowerCase();
	LinkedHashSet<Character> l = new LinkedHashSet<Character>();
	for(int i=0;i<s1.length();i++)
	{
		l.add(s1.charAt(i));
	}
	for(Character ch:l)
	{
		for(int i=s1.length()-1;i>=0;i--)
		{
			if(ch==s1.charAt(i))
			{
				System.out.println(ch+" is in "+(i+1)+"position");
				break;
			}
		}
	}

}
}
