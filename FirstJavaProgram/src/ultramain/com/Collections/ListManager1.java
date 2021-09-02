package ultramain.com.Collections;

import java.util.ArrayList;
import java.util.List;

public class ListManager1
{
	private static void removeElements(List<String> list1, List<String> list2)
	{
		list1.addAll(list2);
		System.out.println("Add two list:"+list1);
		list1.removeAll(list2);
		System.out.println("After removing list1:"+ list2);
	}
	
	public static void main(String args[])
	{
		List<String> list1 = new ArrayList<>();
		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");
		
		List<String> list2 = new ArrayList<>();
		list2.add("Five");
		list2.add("Six");
		list2.add("Seven");
		list2.add("Eight");
		
		removeElements(list1,list2);
	}

	
}
