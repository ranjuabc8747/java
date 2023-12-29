import java.util.TreeSet;

import org.testng.annotations.Test;


public class practice {
	@Test
	public void test1()
		{
		String s1=" wlecom to exple"	;
	String[]s2=s1.split("\\s+");
		for(int i=s2.length-1;i>=0;i--)
		{
			System.out.print(s2[i]+" ");
		}
	}
	//remove the duplicates
	@Test
	public void test2()
	{
		String s1="abcaabd";
		char[] s2 = s1.toCharArray();
		TreeSet<Character> ts =new TreeSet<Character>();
		for(Character e:s2)
		{
			ts.add(e);
		}
		
		
		System.out.println(ts);
	}
	@Test
	public void test3()
	{
		int[]a= {7,5,4,9,8,10,22,7,5};
		TreeSet<Integer> ts=new TreeSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			ts.add(a[i]);
		}
		System.out.println(ts.descendingSet());
		for(Integer b:ts)
		{
		System.out.println(b);
		
	}
	}
		@Test
		public void test4()
		{
			String s="ab bc cd";
			String[] s1 = s.split("\\s+");
			for(int i=0;i<s1.length;i++)
			{
				System.out.print(s1[i]+",");
			
			
		}
	
		}
		@Test
		public void Test4() {
			String s="This is fun show";
			String s1="fun tv show";
			
			//o/p: this is tv;


}
}
