package Arrays;

public class FirstThreeMinimumValues {

	public static void main(String[] args) {
	
		
			int[] a= {0,1,5,0,4,1};
			int fmin=a[0];// 0 0
			int smin=a[0];// 0 1
			int tmin=a[0];
			for(int i=0;i<a.length;i++)
			{
				// i=0 0<5t a[i]=0
				// i=1 1<5t a[i]=1
				if(a[i]<=fmin)//0<=0t,1<=0f
				{
					if(a[i]!=fmin)//0!=0f
					{
						smin=fmin;
						
					}
					fmin=a[i];
				}
				else if(smin==fmin || a[i]<smin)//0==0t||0<0f,0==0t||1<0f
				{
					tmin=smin;
					smin=a[i];// 0,1
				}
				
			
				else if(tmin==smin || a[i]<tmin)
				{
					tmin=a[i];
			}
			}
			System.out.println(fmin+" "+smin+" "+tmin);
		}
}

	

	


