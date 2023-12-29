
package Other;

import org.codehaus.jackson.map.ObjectMapper;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class Tekon2 {

	public static void main(String[] args) {
		ObjectMapper obj=new ObjectMapper();
		//RestAssured r=new RestAssured();
		Response resp = when().get("");
		List<String> list1 = resp.jsonPath().get("colour");
	
		List<String> list2 = resp.jsonPath().get("value");
		HashMap<String, String> map = new HashMap<String,String>();
		for(int i=0;i<list1.size();i++)
		{
			map.put(list1.get(i), list2.get(i));
		}
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the key");
		String s = sc.next();
		for(Entry<String, String> e:map.entrySet())
		{
			if(e.getKey().equalsIgnoreCase(s))
			{
				System.out.println(e.getValue());
			}
		}

	}

}
