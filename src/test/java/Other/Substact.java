package Other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class Substact {
	@Test
	public void test1()
	{
		int[] a= {1,2,3,4,5};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				a[i]=a[i]-1;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
	@Test
	public void test2()
	{
		int[] a= {5,6,11,14,8,7,8,14,11,8};
		TreeSet<Integer> ts=new TreeSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			ts.add(a[i]);
		}
		ts.descendingSet();
		ArrayList<Integer> al=new ArrayList<Integer>(ts);
		for(int i=0;i<al.size();i++)
		{
			System.out.println();
		}
	}
	@Test
	public void thirdmax()
	{
		int[] a= {5,6,11,14,8,7};
		int fst=a[0];
		int snd=a[1];
		int thir=a[2];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>fst)
			{
				thir=snd;
				snd=fst;
				fst=a[i];
			}
			else if(a[i]>snd && a[i]!=fst)
			{
				thir=snd;
				snd=a[i];
			}
			else if(a[i]>thir && a[i]!=fst && a[i]!=snd)
			{
				thir=a[i];
			}
			}
		System.out.println(snd);
		
		
	}
	@Test
	public void synchronize()
	{
		 List<String> list =
	                          Collections.synchronizedList(new ArrayList<String>());
	 
	        list.add("practice");
	        list.add("code");
	        list.add("quiz");
	 
	        synchronized(list)
	        {
	            // must be in synchronized block
	            Iterator it = list.iterator();
	 
	            while (it.hasNext())
	                System.out.println(it.next());
	        }
	}
	@Test
	public void test4()
	{
		int[] a = {10,11,12,13,11,10};
		LinkedHashSet<Integer> l=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
		l.add(a[i])	;
				
			}
		for(Integer b:l)
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				
				if(b==a[i])
				{
					count++;
				}
				
			}
			if(count<=1)
			{
				System.out.println(b);
			}
		}
		}
	@Test
	public void test()
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
		
	}

