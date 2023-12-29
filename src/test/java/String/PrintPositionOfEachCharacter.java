package String;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class PrintPositionOfEachCharacter {
	@Test
	public void test()
	{
	String s="Tester";//t=1 e=2 s=3 r=6
	String s1 = s.toLowerCase();
	LinkedHashSet<Character> l = new LinkedHashSet<Character>();
	for(int i=0;i<s1.length();i++)
	{
		l.add(s1.charAt(i));
	}
	for(Character ch:l)
	{
		for(int i=0;i<s1.length();i++)
		{
			if(ch==s.charAt(i))
			{
				System.out.println(ch+" is in "+(i+1)+" position");
				break;
			}
		}
	}


	}}
