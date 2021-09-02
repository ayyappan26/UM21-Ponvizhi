package ultramain.com.arraylist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Example3 
{
	public static void main(String args[])
	{
		List<String> course = Arrays.asList("C","JAVA","PYTHON");
		
		for(int i=0;i<course.size();i++)
		{
			System.out.println(course.get(i)); //basic for loop
		}
		
		for(String s:course)
		{
			System.out.println(s); //For each loop
		}
		
		for (Iterator iterator = course.iterator(); iterator.hasNext();) { //basic loop with iterator
			String courses = (String) iterator.next();
			System.out.println(courses);
			
			Iterator it = course.iterator();
			while(it.hasNext())
			{
				String c = (String)it.next();
				System.out.println(c);
			}
			
		}
	}
}
