// Method to switch the first and the last character of the given word 

public class Test
{
    // This method returns a String and receives a String
    public static String firstShallBeLast(String word)
    {

		int len_word = word.length();
		String word_first = word.substring(0,1);
		String word_middle = word.substring(1,len_word-1);
		String word_last = word.substring(len_word-1,len_word);
		return word_last + word_middle + word_first;

    }
}

// Method to find the largest of the three numbers which are given

public class Test
{
	public static int largest(int a, int b, int c)
	{
		int tmp = Math.max(a, b);
		int result = Math.max(tmp, c);
		return result

	}
}