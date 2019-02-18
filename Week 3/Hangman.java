import java.util.*;

public class Hangman
{
	public static boolean containsLetter(String word, char letter)
	{
		int lenWord = word.length();
		boolean result = false;
		for(int i=0; i < lenWord; i++)
		{
			if (word.charAt(i) == letter)
			{
				result = true;
				return result;
			}
		}
		return result;
	}

	public static String showLetters(String word, String gusses)
	{
		int lenWord = word.length();
		int lenGusses = gusses.length();
		String result = "";
		for(int i=0; i<lenWord; i++)
		{
			if(containsLetter(gusses, word.charAt(i)))
			{
				result += word.charAt(i);
			}
			else
			{
				result += "_";
			}
		}
		return result;		

	}


	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

        String word = "dog";
		int lenWord = word.length();
		System.out.println("The word is");
		System.out.println("_".repeat(lenWord));
		String s = "";
		while(true)
		{
			System.out.println("Guess a letter:");
			s += in.next();
			String tmp = showLetters(word, s);
			if(tmp.equals(word))
			{
				System.out.println(tmp);
				System.out.print("Well Done, the word was " + word + ".");
				break;
			}
			
			System.out.println(tmp);
			
		}




	}


}