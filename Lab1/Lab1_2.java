import java.util.Scanner;
public class Lab1_2
{
	
	public static void mainM()
	{
		String word = insert();
		if (check(word))
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
	
	public static boolean check(String word)
	{
		char[] charArr = word.toCharArray();
		int wordLength = word.length();
		for (int i = 0; i<wordLength; i++)
		{
			if (charArr[i]!=charArr[wordLength-1-i])
				return false;
		}
		return true;
	}

}