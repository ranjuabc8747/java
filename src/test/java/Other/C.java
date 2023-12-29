package Other;

import java.util.HashMap;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class C {

	@Test
	public void test5()
	{
	int [] a={5,2,7,3,9};
	for(int i=0;i<a.length;i++)
	{
	for(int j=i+1;j<a.length;j++)
	{
	if(a[i]<a[j])
	{
	int temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	}
	}}
	System.out.println("The second maximum number in array is"+ a[1]);
	}
	@Test
	public void test4()
	{
	String s="India";
	String s1=s.toLowerCase();
	LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
	for(int i=0;i<s1.length();i++)
	{
	hs.add(s1.charAt(i));
	}
	System.out.print(hs);
	}
	@Test
	public void test3()
	{
	String s="aabbacc";// o/p a2b2a1c2
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
		break;
	}
	System.out.println(ch[i]+""+count);
}
	}
	}

@Test
public void test1()
{
StringBuffer s=new StringBuffer("Bangalore");
System.out.println(s.reverse());
}
@Test
public void te()
{
String s="boomer";

HashMap<Character,Integer> map=new HashMap<Character,Integer>();
for(int i=0;i<s.length();i++)
{
if(map.containsKey(s.charAt(i)))
{
map.put(s.charAt(i),map.get(s.charAt(i))+1);
}
else
{
map.put(s.charAt(i),1);
}
}
System.out.println(map);
}
@Test
public void tes()
{
String s="Bangalore";
char[] ch=s.toCharArray();
int count=0;
for(Character a:ch)
{
count++;
}
for(int i=count-1;i>=0;i--)
{
System.out.println();
}
}
}


	


