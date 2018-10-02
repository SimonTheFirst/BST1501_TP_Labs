import java.util.Scanner;
public class Lab1_3
{
	public static void main(String[] args)
	{
		work();
	}
	
	/**Reads an integer from console and runs a selected subprogramm*/
	public static void work()
	{
		System.out.println("What action do you want?:");
		System.out.println("1) Get all simple numbers before n");
		System.out.println("2) Check if a word is a palindrome");
		Scanner scan = new Scanner(System.in);
		int choise = Integer.parseInt(scan.nextLine());
		switch (choise)
		{
			case 1:
				Lab1_1 lab1_1 = new Lab1_1();
				lab1_1.run();
				break;
			case 2:
				Lab1_2 lab1_2 = new Lab1_2();
				lab1_2.run();
				break;
			default:
				System.out.println("Not a viable option");
		}
		
	}
}