package ultramain.com.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class ListManager2 
{
	public static void getCollection(String[] name)
	{
		List<String> list = new ArrayList<>(Arrays.asList(name));
		LinkedHashSet<String> set = new LinkedHashSet<String>(list);
		ArrayList<String> withoutDuplicateName = new ArrayList<String>(set);
		System.out.println(withoutDuplicateName);
	}
	public static void main(String args[])
	{
		String name[] = {"Ponvizhi","Divya","Mahesh","Divya"};
		
		getCollection(name);
	}
}
