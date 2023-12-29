package String;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class CountNumberOfOccuranceInString {
	@Test
	public void test()
	{
		String s="I am I am from   Bangalore";
		String s1 = s.toLowerCase();
		String[] s2=s1.split("\\s+");
		
	
		LinkedHashSet<String> l = new LinkedHashSet<String>();
		for(int i=0;i<s2.length;i++)
		{
			l.add(s2[i]);
		}
		
	for(String ch:l)
		{
		int count=0;
			for(int i=0;i<s2.length;i++)
			{
			if(ch.equalsIgnoreCase(s2[i]))
			{
				count++;
			}
			}
			System.out.println(ch+" is repeating "+count+" times");
			
			
		}
	}


	@Test
	public void test2()
	{
		int[] a= {2,3,2,5,4,5,1};
		LinkedHashSet<Integer> l = new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			l.add(a[i]);
		}
		
	
	for( int ch:l)
		{
		int count=0;
			for(int i=0;i<a.length;i++)
			{
			if(ch==(a[i]))
			{
				count++;
			}
			}
			System.out.println(ch+" is repeating "+count+" times");
			
			
		}
	}
	}

