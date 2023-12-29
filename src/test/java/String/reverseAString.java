package String;

import org.testng.annotations.Test;

public class reverseAString {
	@Test
	public void reverseString()
	{
		String s="Bangalore";
		
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		
		{
			 s1 = s1+s.charAt(i);
			
		}
		System.out.println(s1);
	}
	@Test
	public void usingCharAtMethod()
	{
		String s="Bangalore";
		//using for loop
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		
	}
	@Test
	public void usingtoCharArray()
	{
		String s="Bangalore";
		char[] a = s.toCharArray();
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}
	}
	@Test
	public void usingStringBuffer()
	{
		
		   StringBuffer s1 = new StringBuffer("Bangalore");
	System.out.println(s1.reverse());
	}

@Test
public void usingCount()
{
	int count=0;
	String s="Bangalore";
	char[] a = s.toCharArray();
	
	for(char c:a)
	{
		count++;
	}
	System.out.println(count);
	for(int i=count-1;i>=0;i--)
	{
	System.out.print(a[i]);
	}
}

@Test
public void usingCount2()
{
	
	String s="Bangalore is a beautiful place";
	String[] s1 = s.split(" ");
	
	
	
	for(int i=s1.length-1;i>=0;i--)
	{
	System.out.print(s1[i]+" ");
	}
}
}
	
	
	
	

	
