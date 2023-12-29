package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2
{

	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(10);
		al.add(null);
		al.add(20);
		al.add("hel");
		al.add(5);
		System.out.println(al);
		List<Object> al1 = new ArrayList<Object>();
		al1.add(70);
		al1.add("hello");
		al1.add("hii");
		al1.add(50);
		System.out.println(al1);
		al1.add(al);
		System.out.println(al1);
		System.out.println(al.size());
		System.out.println(al1.contains("hel"));
	}

}
