package String;

import org.testng.annotations.Test;

public class ReverseWordComplicated {
@Test
public void reverse()
{
	String s="I am from Bangalore";// e ro lagn aBmorfamI
	String rev="";
	
	for(int i=s.length()-1;i>=0;i--)
	{
		if(s.charAt(i)!=' ')
		{
		rev=rev+s.charAt(i);
		
		}}
		System.out.println(rev);
	
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)==' ')
		{
			rev=rev.substring(0, i)+" "+rev.substring(i, rev.length());
		}
	}
	System.out.println(rev);

		
	}
@Test
public void reverse2()
{
	//String s="Ranjitha";
	String s="Manoj";
	String rev=" ";
	for(int i=0;i<s.length()/2;i++)
	{
		rev=rev+(s.charAt(i));
	}
	System.out.println(rev);
		
			for(int j=s.length()-1;j>=s.length()/2;j--)
			{
				rev=rev+s.charAt(j);
						
			}
		
	
		System.out.println(rev);
}
}


