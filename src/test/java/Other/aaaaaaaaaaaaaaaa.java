package Other;

public class aaaaaaaaaaaaaaaa {

	public static void main(String[] args) {
		String s="aabbccabc";
		char[] ch=s.toCharArray();
		boolean[] b=new boolean[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			if(b[i]==false)
			{
				int count=1;
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						b[j]=true;
						count++;
					}
					else
					{
						break;
					}
				}
				System.out.print(ch[i]+""+count);
			}
		}

	}

}
