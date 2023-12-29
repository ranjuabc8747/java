package map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class FindingPositionUsingKeySetMethod {
	@Test
	public void map()
	{
	String s="TestyYantraa";
	String s1 = s.toLowerCase();
	LinkedHashMap<Character, Object> map=new LinkedHashMap<Character, Object>();
	
	for(int i=0;i<s1.length();i++)
	{
		map.put(s1.charAt(i), i);
	}

	
	for( Character ch:map.keySet())
	{
		for(int i=0;i<s1.length();i++)
		{
			if(ch==s1.charAt(i))
			{
		System.out.println(ch+" "+(i+1));	
		break;
		}
	}
}
}

}
