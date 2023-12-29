package map;

import java.util.HashMap;

public class SSS {
	@Test
	public void to()
	{
	String s="indiaai";
	HashMap<Character, Object> map = new HashMap<Character, Object>();
	for(int i=0;i<s.length();i++)
	{
		if(map.containsKey(s.charAt(i)))
		{
			map.put(s.charAt(i), map.get(s.charAt(i))+1);
		}
		else
		{
			map.put(s.charAt(i),1);
		}
	}
	System.out.println(map);
	}

}
