package Arrays;

public class middleNumbers {

	public static void main(String[] args) {
		int[] a= {1,3,5,7,9};
		for(int i=0;i<9;i++)
		{
			if(!fetchnum(a,i))
			{
				System.out.println(i+" ");
			}
		}
	}
	public static boolean fetchnum(int[]a,int num)
	{
		for(int value:a)
		{
			if(value==num)
			{
				return true;
			}
		}
		return false;
	}

}
