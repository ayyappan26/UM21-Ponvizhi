package ponvizhi.com;
import java.util.*;
class PrimeNumber
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		System.out.println("1");
		int flag = 0;
		for(int i=2;i<=num;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(i);
			}
			flag=0;
		}
	}
}