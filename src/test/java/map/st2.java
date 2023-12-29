package map;

public class st2 {

	public static void main(String[] args) {
		int [] a= {17,9,8,6,3};
		
		int	b=print( a);
		System.out.println(b);
		
		}
			
		
		public static int print(int[] a)
		{
			for(int i=0;i<a.length;i++)
			{
				for(int j=1;j<a.length;j++)
				{
					if(a[i]-a[j]<0)
					{
						return a[j]-a[i];
					}
					else
					{
						return a[j]-a[i];
					}
					
				}
			}
			return 1;
			
		}	
		}

		

	


