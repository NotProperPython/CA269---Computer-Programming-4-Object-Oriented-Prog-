import java.util.*;

public class OnlyHigh
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String s = in.next();
		int len_s = s.length();
		for (int i=0; i<(len_s-1); i++)
		{
			String word = s.substring(i,i+2);
			if (word.equals("hi"))
			{
				System.out.println(word);
			}
		}

	}
}