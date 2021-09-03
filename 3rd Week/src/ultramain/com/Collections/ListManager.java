package ultramain.com.Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*
 * Collections 
 */

public class ListManager 
{
	public static void getArrayList(String[] stringArray)
	{
		List<String> name = Arrays.asList(stringArray);
         Collections.sort(name);
		
		System.out.println("Sorted elements:"+ name);
	}
	public static void main(String args[])
	{
		String [] stringArray = {"Ponvizhi","Mahesh","Jananika","Dharshini"};
		getArrayList(stringArray);
	}
}
