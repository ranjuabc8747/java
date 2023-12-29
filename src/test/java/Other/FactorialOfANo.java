package Other;

import org.testng.annotations.Test;

public class FactorialOfANo {
@Test
public void fact()
{
	int n=10;
	int fact=1;
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	System.out.println(fact);
}
}
