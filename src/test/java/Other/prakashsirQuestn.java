package Other;

import java.util.HashSet;

import org.testng.annotations.Test;

public class prakashsirQuestn {
	@Test
	public void test()
	{
		String s="! im !not ab!le! to!";//output ot elba ton mi
		String[] s1 = s.split("//s+");// !, im, !not, ab!le, to
		
		String s2 = s.replaceAll("!", "");// im not able to
		System.out.println(s2);
		String[] s3 = s2.split(" ");// im, not, able, to 
		for(int i=0;i<s1.length;i++)
		{
		String b=s1[i];
		StringBuffer rev=new StringBuffer();
		 rev.append(s3[i]).reverse();//mi, ton, elba
		 int count=0;
		 for(int j=0;j<b.length();j++)
		 {
			 if(b.charAt(j) != '!')
			 {
				 System.out.print(rev.charAt(count++));
			 }
			 else
			 {
				 System.out.print(b.charAt(j));
			 }
				 
		 }
		 System.out.print(" ");
		
		
		}
		
	}
	@Test
	public void t()
	{
		String s="! im !not ab!le! to!";
		String[] s1 = s.split(" ");
		String s2 = s.replaceAll("!", "");
		String[] s3 = s2.split(" ");
		for(int i=0;i<s1.length;i++ )
		{
			String sr=s1[i];
			String rev="";
			for(int j=sr.length()-1;j>=0;j--)
			{
			if(sr.charAt(j)>='a' && sr.charAt(j)<='z')
			{
				rev=rev+sr.charAt(j);
			}
			
				}
			for(int j=0;j<sr.length();j++)
			{
				//string m="";
				if(sr.charAt(j)>='a' && sr.charAt(j)<='z')
				{
					
				}
			}
			System.out.print(rev);
		}
		
		
		}
	@Test
	public void te()
	{
		int num=1224556;
		String s=Integer.toString(num);
		System.out.println(s);
		for(int i=0;i<s.length();i++)
		{
		
		
	}
	}
}
	


