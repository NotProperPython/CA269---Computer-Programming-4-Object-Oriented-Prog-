import java.util.*;

public class FindMatchingLetters
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two lines:");
		String s1 = in.next();
		String s2 = in.next();
		int len_s1 = s1.length();
		int len_s2 = s2.length();
		int n = Math.min(len_s1, len_s2);
		int numMatching = 0;

		for (int i=0; i<n; i++)
		{
			if (s1.charAt(i) == s2.charAt(i))
			{
				numMatching++;
			}
		}

		System.out.println("There are " + numMatching + " corresponding characters.");

	}
}