package Other;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class String1 {
	@Test
	public void test1() {
		String s="aaabbcdddf";
		LinkedHashSet<Character> l=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			l.add(s.charAt(i));
		
		}
		for(Character e:l)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(e==s.charAt(i))
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.print(count+""+e+":");
			}
		}
	}
	@Test
	public void test2()
	{
		String s="Ranjitha";
		//s.split(" ");
		String s1="";
		int length=s.length();
		//System.out.println(length);
		
		int i=0;
		while(i<length)
		{
			s1=s.charAt(i)+s1;
			i++;;
			
		}
		System.out.println(s1);
		
		
	}
	@Test
	public void test3()
	{
		String s="Im in mysore";
		
		System.out.println(s.substring(1)+s.substring(1, 4)+s.substring(5, 8));	
		
	}
	@Test
	public void test4()
	{
		String s="i am selenium";//m ui nelesmai
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
			rev=s.charAt(i)+rev;
		}
		}
		System.out.println(rev);
		
		
//		for(int i=0;i<s.length();i++)
//		{
//			
//		if(s.charAt(i)==' ')
//		{
//		
//		 rev = (rev.substring(0,i)+" "+rev.substring(i,rev. length()));
//		}}
//		System.out.println(rev);
//		
//	}
		
		
			System.out.println(rev.substring(0,1)+" "+rev.substring(1, 3)+" "+rev.substring(3, 11));
		
		

}
}
				

		
		


