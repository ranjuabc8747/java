import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Interview {

	@Test
	public void test1()
	{
	String s=	"This is Tekion";
	//O/p = ThisisTekion
	String[] s1 = s.split("\\s+");
	for(int i=0;i<s1.length;i++)
	{
		System.out.print(s1[i]);
	}
	
		

	}
	@Test
	public void test2()
	{
		
		String s = "abcdasbcderacd";
		char[] ch=s.toCharArray();
		HashMap<Character,Object> hs=new HashMap<Character,Object>();
		for(int i=0;i<ch.length;i++)
		{
			hs.put(ch[i],i);
		}
		for(Entry<Character,Object> a:hs.entrySet())
		{
			int count=0;
			for(int i=0;i<ch.length;i++)
			{
				
			if(a.getKey()==ch[i])
			{
				count++;
			}
			}
			
		
			System.out.println(a.getKey() + " "+ "is occuring"+" "+count+"times");
		
	}
	}
	}
	
