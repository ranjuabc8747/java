package Other;

import java.util.LinkedHashSet;

public class Occurance {

	public static void main(String[] args) {
		String s="aababccd";
		LinkedHashSet<Character> ls=new LinkedHashSet<Character>();
 		for(int i=0;i<s.length();i++)
		{
			ls.add(s.charAt(i));
		}
 		for(Character a:ls)
 		{
 			int count=0;
 			for(int i=0;i<s.length();i++)
 			{
 				if(a==s.charAt(i))
 				{
 					count++;
 				}
 			}
 			System.out.println(a+" "+"repeating"+count);
 		}

	}

}
