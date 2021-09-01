package ultramain.com.arraylist;
import java.util.*;
public class Example1
{
	public static void main(String args[])
	{
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(11);
		l1.add(67);
		l1.add(3);	
		l1.add(0,6);
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));

		}
	}
}
