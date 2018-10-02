import java.util.Scanner;
public class Lab1_2
{
	
	public static void run()
	{
		String word = insert();
		if (check(word)==0)
			System.out.println("It's a palindrome");
		else 
			System.out.println("It's not a palindrome");
	}
	
	public static String insert()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word to check:");
		String word = scan.nextLine();
		return word;
	}
	
	public static int check(String word)
	{
		String wordR = new StringBuilder(word).reverse().toString();
		return word.compareTo(wordR);
	}

}