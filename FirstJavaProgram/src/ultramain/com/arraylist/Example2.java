package ultramain.com.arraylist;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Example2 
{
	public static void main(String args[])
	{
		Integer arr[] = new Integer[20];
		int r = 0;
		for(int i=0;i<20;i++)
		{
			r = new Random().nextInt(50);
			//System.out.println(r);
			arr[i] = r;
		}
		for(int res:arr)
		{
			System.out.println(res);
		}
		
		List<Integer> l1;
		l1 = Arrays.asList(arr); //type casting
		
		Collections.sort(l1);
		System.out.println("After sorting");
		for(int s:l1)
		{
			System.out.println(s);
		}
	}
}