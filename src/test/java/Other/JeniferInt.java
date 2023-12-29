package Other;

import java.util.Scanner;

import org.testng.annotations.Test;

public class JeniferInt {
	@Test
	public void test1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st sentence");
		String s1=sc.nextLine();
		System.out.println("Enter the 2nd sentence");
		String s2=sc.nextLine();
		System.out.println("Enter the 3rd sentence");
		String s3=sc.nextLine();
		String[] s4=s1.concat(s2).split(" ");
		int count=1;
		for(int i=0;i<s4.length;i++)
		{
			if(s3.equals(s4[i]))
			{
				count++;
			}
		}
		System.out.println(s3+"is repeating"+ count);
		
		
	}
	@Test
	public void test2()
	{
		int[] a= {5,4,7,9,6};
		int[] b= {9,6,2,3,4};
		int []c=new int[a.length+b.length];
		int rem=0;
		int q=0;
		for(int i=c.length-1;i>=0;i--)
			
		{
			int d=a[i]+b[i]+q;
			 rem=d%10;
			  q=d/10;
			  
			c[i]=rem;
			if(i==0)
			  {
				  c[i]=a[i]+b[i]+q;
				  break;
			  }
			
		}
		for(int i=0;i<c.length;i++)
		{
		
		System.out.println(c[i]);
		
	}

}
	@Test
	public void test3()
	{
		String s="Rannnnja";
		char[] ch=s.toCharArray();
		boolean[] b = new boolean[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			if(b[i]==false)
			{
			//	int count=1;
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						b[j]=true;
					}
					
				}
				System.out.println(ch[i]);
			}
			
		}
		
	}
}
