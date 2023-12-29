
public class tryandcatch {

	 static public void main(String[] args) {

try {
	int a=10;
	int b=0;

	System.out.println(a/b);
	return;
}
catch(Exception e)
{
System.out.println("error occur");
	}
finally {
	System.out.println("finall");
}


}
}
