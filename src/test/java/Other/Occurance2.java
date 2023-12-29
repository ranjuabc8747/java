package Other;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Occurance2 {
	@Test
	public void test1()
	{
		String dup="";
		String unique="";
		String s="aabbcde";
		HashMap<Character,Integer>hs=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(hs.containsKey(s.charAt(i)))
			{
				hs.put(s.charAt(i), hs.get(s.charAt(i))+1);
			}
			else
			{
				hs.put(s.charAt(i), 1);
			}
		}
		
		for (Entry<Character,Integer> entry : hs.entrySet()) {
			
			if(entry.getValue()>1)
			{
				dup=dup+entry.getKey();
			}
			else
			{
				unique=unique+entry.getKey();
			}
		}
			
		System.out.println(dup);
		System.out.println(unique);
	}
	@Test
	public void test2()
	{
		String s="i love india";
		
		String s1=s.replaceAll(" ", ""); //iloveindia
		
		int count=s1.length()-1;
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!=' ')
			{
				System.out.print(s1.charAt(count--));
				
			}
			else
			{
				System.out.print(s.charAt(i));
			}
			
		}
	}

}
