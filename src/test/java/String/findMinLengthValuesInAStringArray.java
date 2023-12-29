package String;

import org.testng.annotations.Test;

public class findMinLengthValuesInAStringArray {
	@Test
	public void minLength()
	{
		String[] s= {"abcd","a","bcdf","edf","d"};
		String min=s[0];
	
		for(int i=0;i<s.length;i++)
		{
	      if(s[i].length()<min.length())
	       {
		    min=s[i];
	       }
		
	}
		for(int i=0;i<s.length;i++)
		{
			if (s[i].length()==min.length())
			{
				System.out.println(s[i]);
			}
		}

}
}
