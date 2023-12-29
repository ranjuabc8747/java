package String;

import org.testng.annotations.Test;

public class FindOccuranceWithtUsingCollection {
	@Test
	public void test()
	{
		String str="aabcddaab";
		char[] ch = str.toCharArray();
		boolean[] b = new boolean[ch.length];
		for(int i=0;i<ch.length;i++)//a
		{
			if(b[i]==false)
			{
				int count=1;
				for(int j=i+1;j<ch.length;j++)//a b
				{
					if(ch[i]==ch[j])
					{
						b[j]=true;
						count++;
					} 
				}
				System.out.print(ch[i]+""+count);
			}
		}
		System.out.println();
	}

}
