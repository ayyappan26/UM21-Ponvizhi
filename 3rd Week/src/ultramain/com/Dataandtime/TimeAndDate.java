package ultramain.com.Dataandtime;
import java.text.*;
import java.util.Date;
import java.util.TimeZone;
public class TimeAndDate
{
	
	/*
	 * Date and Time
	 * 
	 * 
	 */
	public static void main(String[] args) throws ParseException
	{
		Date date = new Date();
		TimeZone.setDefault(TimeZone.getTimeZone("EST"));
		System.out.println(date);
		TimeZone.setDefault(TimeZone.getTimeZone("IST"));
		SimpleDateFormat s = new SimpleDateFormat("yy/MM/dd K:m a");
		System.out.println(s.format(date));
		TimeZone.setDefault(TimeZone.getTimeZone("IST"));
		SimpleDateFormat s1 = new SimpleDateFormat("K:m:s a");
		System.out.println(s1.format(date));
		SimpleDateFormat s2 = new SimpleDateFormat("MMM d,yyyy K:m:s a ");
		System.out.println(s2.format(date));
		TimeZone.setDefault(TimeZone.getTimeZone("EST"));
		SimpleDateFormat s3 = new SimpleDateFormat("K:m:s a z ");
		System.out.println(s3.format(date));
		TimeZone.setDefault(TimeZone.getTimeZone("IST"));
		SimpleDateFormat s4 = new SimpleDateFormat("MMM d, yyyy K:m a ");
		System.out.println(s4.format(date));
		TimeZone.setDefault(TimeZone.getTimeZone("EST"));
		SimpleDateFormat s5 = new SimpleDateFormat("MMMM d, yyyy K:m a z ");
		System.out.println(s5.format(date));





	}
}
//•	Nov 4, 2003 8:14 PM •	November 4, 2003 8:14:11 PM EST