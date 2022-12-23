package dec20DemoException;


import java.util.*;

@SuppressWarnings("serial")
public class DemoException2 extends Exception
{

	public DemoException2(String msg)
	{
		super(msg);
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		try
		{
			System.out.println("Enter the amt:");
			int amt = s.nextInt();//Exception for


			if(!(amt>0 && amt%100==0))//Exception

			{
				DemoException2 ob = new	DemoException2("Invalid amt");
				throw ob;
			}
			if(amt>2000)//Exception Condition
			{
				DemoException2 ob = new	DemoException2("Insufficient fund");

				throw ob;
			}
			System.out.println("Amt withDrwan:"+amt);
			System.out.println("Balance amt:"+(2000-amt));

			System.out.println("Transaction Completed...");
		}//end of try
		catch(InputMismatchException ime)
		{
			System.out.println("Enter only Integer value....");
		}
		catch(DemoException2 ob)
		{
			System.out.println(ob.getMessage());
		}

		finally
		{
			s.close();
		}
	}
}
