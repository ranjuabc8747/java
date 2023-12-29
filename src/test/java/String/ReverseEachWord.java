package String;

import java.util.HashMap;

import org.testng.annotations.Test;

public class ReverseEachWord {
	@Test
	public void reverseeEachWordInString()
	{
		String s="I am from Bangalore";//I ma morf erolagnaB
		String[] s1 = s.split(" ");
		
		for(int i=0;i<s1.length;i++)
		{
			String rev=s1[i];
			for( int j=rev.length()-1;j>=0;j--)
			{
			System.out.print(rev.charAt(j));
		}
			System.out.print(" ");
		
	}

}
	@Test
	public void reverseeEachWordInString2()
	{
		String s="I am from Bangalore";//erolagnaB morf ma I 
		String[] s1 = s.split(" ");
		
		for( int i=s1.length-1;i>=0;i--)
			{
				String rev=s1[i];
				for( int j=rev.length()-1;j>=0;j--)
				{
				System.out.print(rev.charAt(j));
				}
				System.out.print(" ");
			}
	}

	@Test
	public void reverseeEachWordInString3()
	{
		String s="I am from Bangalore";
		String[] s1 = s.split(" ");

for( int i=s1.length-1;i>=0;i--)
{
System.out.print(s1[i]+" ");	
}
			
				
				
			
			
	}
	@Test
	public void y2()
	{
		 int []a={5,7,10,15,18};
	       for(int i=0;i<a.length-1;i++)
	       {
	           for(int j=a[i]+1;j<a[i+1];j++)
	           {
	               System.out.println(j);
	           }
	}
}
	@Test
	public void t()
	{
	String s="boomer";

	HashMap<Character,Integer> map=new HashMap<Character,Integer>();
	for(int i=0;i<s.length();i++)
	{
	if(map.containsKey(s.charAt(i)))
	{
	map.put(s.charAt(i),map.get(s.charAt(i))+1);
	}
	else
	{
	map.put(s.charAt(i),1);
	}
	}
	System.out.println(map);
	}
}


