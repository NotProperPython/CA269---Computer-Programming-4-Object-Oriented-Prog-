import java.util.*;

public class SplitWord
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String s = in.next();
		int len_s = s.length();
		for (int i=0; i<(len_s-1); i++)
		{
			System.out.println(s.substring(i,i+2));
		}

	}
}