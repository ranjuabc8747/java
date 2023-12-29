package String;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class RemoveDuplicatesInString {
	@Test
	public void removeDupl()
	{
		String s="Tester";
		String st = s.toLowerCase();
		LinkedHashSet<Character> l = new LinkedHashSet<Character>();
		for(int i=0;i<st.length();i++)
		{
		l.add(st.charAt(i))	;
		
		}
		for(Character ch:l)
		{
			
		System.out.print(ch+" ");
	}

}}
