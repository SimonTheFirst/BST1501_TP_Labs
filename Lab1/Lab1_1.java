import java.util.Scanner;
public class Lab1_1
{
	public static void mainM()
	{
		int n = insert();
		for (int i=2; i<= n; i++)
		{
			if(check(i))
				output(i);
		}
		return;	
	}
	
	public static int insert()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = Integer.parseInt(scan.nextLine());
		return n;
	}
	
	public static void output (int i)
	{
		System.out.println(i);
	}
	
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