package ultramain.com.bank;

public class Bank
{
	public static void main(String args[])
	{
		Test.setbankname("HDFC");
		
		Test user1 = new Test();
		user1.setusername("Divya");
		user1.setaccountnumber(1234567);
		user1.setdepositamount(3000.8f);
		
		Test user2 = new Test();
		user2.setusername("Mahesh");
		user2.setaccountnumber(7654321);
		user2.setdepositamount(7890.8f);

		
		
		user1.viewbalance();
		user2.viewbalance();

	}
	
}

 class Test
{
	private int accno;
	private String username;
	public static String bankname;
	private float depositamount;
	
	public static void setbankname(String bank)
	{
		bankname = bank;
	}
	public  String getbankname()
	{
		return bankname;
	}
	
	public void setaccountnumber(int accountno)
	{
		accno = accountno;
	}
	public int getaccountnumber()
	{
		return accno;
	}
	
	public void setusername(String name)
	{
		username = name;
	}
	public String getusername()
	{
		return username;
	}
	
	
	
	public void setdepositamount(float amount)
	{
		if(amount>0)
		{
			depositamount = amount;
		}
		else
		{
			System.out.println("INVALID AMOUNT");
		}
	      //depositamount = amount;
	}
	public float getdepositamount()
	{
		return depositamount;
	}
	
	
	public void viewbalance()
	{
		System.out.println(username);
		System.out.println(bankname);
		System.out.println(depositamount);
		System.out.println(accno);
		System.out.println("____________________________________");
		
	}
}