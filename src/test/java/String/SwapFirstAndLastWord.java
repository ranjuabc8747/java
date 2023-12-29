package String;

import org.testng.annotations.Test;

public class SwapFirstAndLastWord {
@Test
public void swap()

{
	String s="I am from Bangalore";
	 String[] s1 = s.split(" ");
	 for(int i=0;i<s1.length;i++)
	 {
	 System.out.print(s1[i]+" ");
	  
	 }
	 System.out.println();
	 String temp = s1[0];
		s1[0]= s1[s1.length-1];
		s1[s1.length-1]=temp;
		for(int i=0;i<s1.length;i++)
		{
		 System.out.print(s1[i]+" ");	
	}
		
}
}

