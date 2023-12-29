package Other;

import java.util.Arrays;

public class BhavanQusetion {

	public static void main(String[] args) {

String s="ranjithah";

char[] s1 = s.toCharArray();
Arrays.sort(s1);
 boolean[] b = new boolean[s1.length];
 for(int i=0;i<s1.length;i++)
 {
	 if(b[i]==false)
			 {
		 int count=1;
		 for(int j=i+1;j<s1.length;j++)
		 {
			 if(s1[i]==s1[j])
			 {
				 b[j]=true;
				 count++;
			 }
			 
		 }
		 System.out.print(s1[i]+""+count);
		}
	 System.out.print("");
 }
	 
	
 
// Arrays.sort(s1);

 

 }

	}



