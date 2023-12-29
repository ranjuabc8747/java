package Other;
//CHECK WEATHER THE GIVEN NUMBER IS PRI E OR NOT
import org.testng.annotations.Test;

public class Primeno {
	@Test
	public void prime()
	{
		int n=9;
		int a=2;
		int count=0;
		while(a<=n/2)
		{
			if(n%a==0)
			{
				count++;
			}
			a++;
		}
		if(count==0)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime number");
		}
		
	}
	@Test
    public void missingNum(){
        int [] ar = {2,5,7,9,11,14,17};
        for (int i = 0; i < ar.length-1; i++) {
           for (int j = ar[i]+1; j < ar[i+1]; j++) {
           System.out.println(j);
           }
        }
    }

}
