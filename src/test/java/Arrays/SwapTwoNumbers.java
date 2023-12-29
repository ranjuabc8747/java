package Arrays;

import org.testng.annotations.Test;

public class SwapTwoNumbers {
	@Test
	public void swap2numbers()
	{
		int a=10;
		int b=20;
		System.out.println("Before swapping");
		System.out.println(a);
		System.out.println(b);
		int c=a;
		a=b;
		b=c;
		System.out.println("After swapiing");
		System.out.println(a);
		System.out.println(b);
	}


@Test
public void withoutThirdVariable()
{
int a=5;
int b=10;
System.out.println("BeforeSwapping");
System.out.println(a);
System.out.println(b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("After swapping");
System.out.println(a);
System.out.println(b);
}

}
