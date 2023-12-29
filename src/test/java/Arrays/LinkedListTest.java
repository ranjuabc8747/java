package Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class LinkedListTest {
@Test
	public void link() {
		LinkedList<Object> l = new LinkedList<Object>();
		l.add(10);
		l.add(5);
		l.add("hello");
		l.add(1);
		l.add(5.0);
		l.add(null);
		l.add(null);
System.out.println(l);
l.addFirst(20);
l.addLast(50);
System.out.println(l);
System.out.println(l.getFirst());
System.out.println(l.getLast());
System.out.println(l);
l.removeFirst()	;
l.removeLast();
System.out.println(l);
	}


@Test
public void priority()
{
	PriorityQueue<Object> b = new PriorityQueue<Object>();
b.add(10);
b.add(30);
b.add(40);
System.out.println(b);
System.out.println(b.peek());
System.out.println(b);
System.out.println(b.poll());
System.out.println(b);


}
@Test
public void test()
{
	HashSet<Object> set = new HashSet<Object>();
	set.add(40);
	set.add("hi");
	set.add(null);
	set.add(null);
	System.out.println(set);
ArrayList<Object> list = new ArrayList<Object>(set);
list.add(10);
list.add("helllllllo");
list.add(6.0);
list.add(6.0);
System.out.println(list);
}
@Test
public void linkedHashset()
{
	LinkedHashSet<Object> lhs = new LinkedHashSet<Object>();
	lhs.add(10);
	lhs.add("hello");
	lhs.add(5.0);
	lhs.add("hello");
	lhs.add(50);
	lhs.add(null);
	System.out.println(lhs);
}
@Test
public void TreeSet1()
{
	TreeSet<Object> ts = new TreeSet<Object>();
	ts.add(100);
	ts.add(45);
ts.add(5);
ts.add(40);
System.out.println(ts);
System.out.println(ts.descendingSet());

}
@Test
public void hashTable1()
{
	Hashtable<Object, Object> map = new Hashtable<Object, Object>();
	map.put(8, 10);
	map.put(10, "hello");
	map.put(9, 10);
	map.put(12, 10);
	map.put(11, "hr");
	//map.put(null, 60); not allowed
	//map.put(50, null);not allowed
	System.out.println(map);
	for (Entry<Object, Object> m : map.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
		
	}
		
	
}
@Test
public void hashMap1()
{
	HashMap<Integer, Object> map = new HashMap<Integer, Object>();
	map.put(60, "hi");
	map.put(null, 50);
	map.put(60, 2);
	map.put(8, 50);
	map.put(null,5);
	map.put(55, "ranju");
	map.put(5, null);
	map.put(4, null);
	System.out.println(map);
	for (Entry<Integer, Object> m : map.entrySet()) {
		System.out.println(m.getKey()+"  "+m.getValue());
		
		
	}
}
@Test
public void treeMap1()
{
	TreeMap<Integer, Object> map = new TreeMap<Integer, Object>();
	map.put(60, "hi");
	map.put(60, 2);
	map.put(8, 50);
	map.put(55, "ranju");
	map.put(5, null);
	map.put(4, null);
	System.out.println(map);
	for (Entry<Integer, Object> m : map.entrySet()) {
		System.out.println(m.getKey()+"  "+m.getValue());

}
}
}

