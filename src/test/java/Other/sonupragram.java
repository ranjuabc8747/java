package Other;

import java.util.Arrays;

import org.testng.annotations.Test;

public class sonupragram {
@Test
public void test()
{
	int[]a= {1,3,0,5,7,8,9,10};//;/p=17
	int[]c=new int[a.length];
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			c[i]=a[i]+a[j];
		}
	}
	Arrays.sort(c);
	for(int i=c.length-1;i>0; i--)
	{
		System.out.println(c[i]);
		break;
	}
	
	
}
@Test
public void test2()
{
	int[] a= {0,1,3,5,7,8,6,4};
	Arrays.sort(a);
	for(int i=0;i<a.length-1;i++)
	{
	System.out.println(a[i]+"  "+a[i+1]);
	i++;
}
	if(a.length%2==1)
	{
	System.out.println(a[a.length-1]);
}
}
}
