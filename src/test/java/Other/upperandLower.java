package Other;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class upperandLower {
	@Test
	public void test()
	{
		String s="ranjitha";
		char[] s1 = s.toCharArray();
		for(int i=0;i<s1.length;i+=2)
		{
			s1[i]=Character.toUpperCase(s1[i]);
		}
		System.out.println(s1);
	}
	@Test
	public void test2()
	{
		String s="RANJITHA";
		char[] s1 = s.toCharArray();
		for(int i=0;i<s1.length;i+=2)
		{
			s1[i]=Character.toLowerCase(s1[i]);
		}
		System.out.println(s1);
		
		}
	@Test
	public void test3()
	{
		int a=12321112;
		String a1 = Integer.toString(a);
		char[] ch = a1.toCharArray();
		
		HashSet<Character> hs=new HashSet<Character>();
		for(int i=0;i<ch.length;i++)
		{
			hs.add(ch[i]);
		}
		for(Character e:hs)
		{
			int count=0;
			for(int i=0;i<ch.length;i++)
			{
				if(e==ch[i])
				{
					count++;
				}
			}
			System.out.print(e+"/"+count+" ");
		}
		}
	@Test
	public void test4()
	{
		int[] a= {10,5,10,5,10,8,5,10,8};
		int count1=0;
		int max=0;
		HashMap <Integer,Integer>hs=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					if(i>j)
					{
						break;
					}
					else
						count++;
					}
				}
			if(count>=1)
			{
				if(count1<count)
				{
					//max=a[i];
					count1=count;
				}
				hs.put(a[i], count);
				
				
			}
			for(Entry<Integer,Integer> b:hs.entrySet())
			{
				if(b.getValue()==count1)
				{
					System.out.println(b.getKey());
				}
			}
		
				
		}
	}
	}
