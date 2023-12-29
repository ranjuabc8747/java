package map;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

//REMOVE DUPLICATES USING MAP
import org.testng.annotations.Test;

public class RemoveDuplicates {
	
	@Test
	public void map()
	{
		String s="TestYantra";
		String s1 = s.toLowerCase();
		LinkedHashMap<Character, Object>map=new LinkedHashMap<Character, Object>();
		for(int i=0;i<s1.length();i++)
		{
			map.put(s1.charAt(i), i);
		}
		for(Entry<Character, Object> m:map.entrySet())
		{
			
			System.out.print(m.getKey()+" ");
		}
	}

}
