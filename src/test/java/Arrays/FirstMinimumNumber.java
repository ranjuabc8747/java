package Arrays;

import java.util.ArrayList;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class FirstMinimumNumber {
@Test
public void firstMinimumNumber()
{
	int[] a= {10,5,15,3,7,25,3,5};
	LinkedHashSet<Integer> l = new LinkedHashSet<Integer>();
	for(int i=0;i<a.length;i++)
	{
		l.add(a[i]);
	}
	for(Integer ch:l)
	{
	System.out.println(ch);
	
	}
}
		//System.out.println("the first min number is "+a[0]+a[1]+a[2]);
	


//this method is wrong for duplicate numbers
//first three minimum no in array
@Test
public void first3MinimumNumber()
{
	int[] a= {10,5,15,3,7,25,3,25,15,3,7};
	LinkedHashSet<Integer> l = new LinkedHashSet<Integer>();
	for(int i=0;i<a.length;i++)
	{
		l.add(a[i]);
	}
	ArrayList<Object> a1 = new ArrayList<Object>(l);
	System.out.println(l);
	for(int i=0;i<a1.size();i++)
	{
		for(int j=i+1;j<a1.size();j++)
		{
		if(a[i]>a[j])
{
	int temp=a[i];
	a[i]=a[j];
	a[j]=temp;
}	
		}}
	int sum=0;
	for(int i=0;i<3;i++)
	{
		sum=sum+a[i];
		
	}
	System.out.println("the sum of first 3 max number is "+sum);
}}



