package map;

public class a {

	public static void main(String[] args) {
		
		
	Boolean	res=isPrime(7);
	if(res==true)
	{
		System.out.println("is prime");
	}
	else
		System.out.println("is not a prime");
	}
	public static boolean isPrime( int n)
		{
		int a=2 ;  n=7;
			 while(a<=n/2)
			 {
				 if(n%a==0)
				 {
					return false;
				 }
				 a++;
			 }
			 return true;
		}
}
