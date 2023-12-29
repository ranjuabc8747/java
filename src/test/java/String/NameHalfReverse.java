package String;

import org.testng.annotations.Test;

public class NameHalfReverse {
	@Test
	public void name()
	{
		String s="Ranjitha";
		String rev="";
		for(int i=0;i<4;i++)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		String s1=s;
			String rev1="";
			for(int j=s1.length()-1;j>=4;j--)
			{
				rev1=rev1+s1.charAt(j);
			}
		System.out.println(rev+rev1);
			
	

}
}


	


