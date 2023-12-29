package map;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class RemoveDuplicate2 {
	@Test
	public void abc()
	{
		String s="I am From I am From TestYantra";
		String s1 = s.toLowerCase();
		String[] s2 = s1.split("\\s+");
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		for(int i=0;i<s2.length;i++)
		{
			map.put(s2[i],i);
		}
		for( String ch:map.keySet())
		{
			System.out.print(ch+" ");
		}


}
	//USING COLLECTION
	@Test
	public void collection()
	{
		String s="I am From I am From TestYantra";
		String s1 = s.toLowerCase();
		String[] s2 = s1.split("\\s+");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<s2.length;i++)
		{
			set.add(s2[i]);
		}
		for( String ss:set)
		{
		System.out.print(ss+" ");
}
}
}
