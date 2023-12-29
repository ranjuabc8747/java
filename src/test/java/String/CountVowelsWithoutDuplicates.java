package String;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class CountVowelsWithoutDuplicates {
@Test
public void duplicates()
{
	String s="India";
	String s1=s.toLowerCase();
	LinkedHashSet<Character> l = new LinkedHashSet<Character>();
for(int i=0;i<s1.length();i++)
{
	l.add(s1.charAt(i));
}
int count=0;
for(Character c:l)
{
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			count++;
			System.out.println(c);
		}
	}
	System.out.println(count);
}

}

