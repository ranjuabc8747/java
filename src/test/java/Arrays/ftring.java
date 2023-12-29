package Arrays;

import org.testng.annotations.Test;

public class ftring {
	@Test
	public void to()
	{
		String s1="abcd";//output a4b5c6d8
		String s2="4568";
		String s3=s1+s2;
		String fiinal="";
		for(int i=0;i<s3.length();i++)
		{
if(i<s1.length())
{
	fiinal=fiinal+s1.charAt(i);
}
if(i<s2.length())
{
	fiinal=fiinal+s2.charAt(i);
}
}
		System.out.println(fiinal);

}
	@Test
	public void t3()
	{
		String s="aabbccabc"; //output a2b2c2a1b1c1
		int count=1;
		for(int i=0;i<s.length()-1;i++)
		{
			{
				if(s.charAt(i)==s.charAt(i+1))
				{
					count++;
}
				else
				{
					System.out.print(s.charAt(i)+""+count);
					count=1;
				}
			}
		}
		
		System.out.println(s.charAt(s.length()-1)+""+count);
	}
	@Test
	public void t4()
	{
		int[]a= {1,4,6,9,7,5,2,3};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			if(a[i]%2==0)
			{
			System.out.println(a[i]);
			break;
			}
			
		}
		
		
		}
	@Test
	public void t5()
	{
		String s="selenium";
		String result="";
		for(int i=0;i<s.length();i++)
		{
			result=result+s.charAt(i);
			System.out.print(result+" ");
		}
	}
	@Test
	public void t6()
	{
		String s="aabbcdaaa";
		char[] ch=s.toCharArray();
		boolean[] b=new boolean[ch.length];
		for(int i=0;i<ch.length;i++)
		{
		if (b[i]==false)
		{
		int count=1;
		for(int j=i+1;j<ch.length;j++)
		{
		if(ch[i]==ch[j])
		{
		b[j]=true;
		count++;
		}
		else
			break;
		}
		System.out.print(ch[i]+""+count);
		}
	}
	}
}
