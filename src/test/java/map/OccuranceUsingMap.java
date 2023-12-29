package map;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class OccuranceUsingMap {
	@Test
	public void map()
	{
		String st="TestYantra";
		String s1 = st.toLowerCase();
		LinkedHashMap<Character,Object>map=new LinkedHashMap<Character,Object>();
		for(int i=0;i<s1.length();i++)
		{
			map.put(s1.charAt(i), i);
		}
		for(Entry<Character, Object> m:map.entrySet())
		{
			int count=0;
			for(int i=0;i<s1.length();i++)
			{
				if(m.getKey()==s1.charAt(i))
				{
				count++;	
				}
			}
		
		System.out.println(m.getKey()+" "+count);
		}
	}
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



