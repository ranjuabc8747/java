package map;



import java.util.HashMap;

import org.testng.annotations.Test;

public class OccuranceUsingOnlyOneLoop {
	@Test
	public void test()
	{
String s="indiaai";
HashMap<Character, Integer> map = new HashMap<Character, Integer>();
for(int i=0;i<s.length();i++)
{
	if(map.containsKey(s.charAt(i)))
	{
		map.put(s.charAt(i), map.get((s.charAt(i))+1));
	}
	else
	{
		map.put(s.charAt(i),1);
	}
}
System.out.println(map);
}

@Test
public void test2()
{
	String s="aabbccdda";
    HashMap<Character,Object> map=  new HashMap<Character,Object>();
       for(int i=0;i<s.length();i++)
       {
         if(map.containsKey(s.charAt(i)))
         {
             map.put(s.charAt(i),map.get((s.charAt(i))+1));
         }
         else
         {
             map.put(s.charAt(i),1);
         }
       }
       System.out.println(map);
    }
}


