package String;

import org.testng.annotations.Test;

public class AddNumInAString {
	@Test
	public void addNum()
	{
		String s="a3b2d44";//3+2+4+4
		char[] s1 = s.toCharArray();
		
		int sum=0;
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i]>='0' && s1[i]<='9')
			{
				int num=s1[i]-48;
				sum=sum+num;
			}
			
		}
		System.out.println(sum);
		

}}
