import java.util.Scanner;
public class Lab1_1
{
	/**Checks all numbers from 2 to n */
	public static void run()
	{
		int n = insert();
		for (int i=2; i<= n; i++)
		{
			if(check(i))
				output(i);
		}
		return;	
	}
	
	/**Reads an integer from console*/
	public static int insert()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = Integer.parseInt(scan.nextLine());
		return n;
	}

	/**Outputs a number into console*/
	public static void output (int i)
	{
		System.out.println(i);
	}
	
	/**Checks if a number is prime or not*/
	public static boolean check (int k)
	{
		for (int i=2; i<k; i++)
		{
			if (k%i == 0)
			{
				return false;
			}
		}
		return true;
	}
}