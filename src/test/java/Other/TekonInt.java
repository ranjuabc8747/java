package Other;

import org.testng.annotations.Test;

public class TekonInt {
	public static void main(String[] args) {
		String s="tekon123";
		String alpha="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a'&& s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z')
			{
				
				alpha=alpha+s.charAt(i);
			}
		}
		System.out.println(alpha);
	}
	

}




