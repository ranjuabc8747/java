package String;

public class sivblnprogm {

	public static void main(String[] args) {
	
		
			String s= "aabccdakk"; //w3p1r1e2t1i1e1
			
			int count=1;
			for (int i = 0; i < s.length()-1; i++) {
				
				if(s.charAt(i)==s.charAt(i+1))
				{
					count++;
				}
				else
				{
					System.out.println(s.charAt(i)+" "+count);
					count=1;
				}
			}
		System.out.println(s.charAt(s.length()-1)+" "+count);
		}

	}


