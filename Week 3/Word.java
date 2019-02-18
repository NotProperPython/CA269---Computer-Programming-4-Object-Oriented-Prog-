import java.util.*;

public class Word
{

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


	public static String showLetter(String s, char c)
	{
		int lenS = s.length();
		String result = "";
		for(int i=0; i < lenS; i++)
		{
			if(s.charAt(i) == c)
			{
				result += c;
			}

			else
			{
				result += "_";
			}
		}
		return result;
	}


	public static boolean allDone(String word, String letters)
	{
		int lenWord = word.length();
		int lenLetters = letters.length();
		boolean result = true;
		for(int i=0; i<lenWord; i++)
		{
			if(containsLetter(letters, word.charAt(i)))
			{
				continue;
			}
			else
			{
				return false;
			}
		}
		return result;

	}

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

    public static boolean isFirstLetter(String word, char letter)
    {
        return word.charAt(0) == letter;
    }
}