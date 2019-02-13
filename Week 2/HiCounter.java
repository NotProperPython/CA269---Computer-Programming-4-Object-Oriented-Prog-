import java.util.*;

public class HiCounter
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a phrase: ");
		String s = in.next();
		int len_s = s.length();
		int count = 0;
		for (int i=0; i<(len_s-1); i++)
		{
			String word = s.substring(i,i+2);
			if (word.equals("hi"))
			{
				count++;
			}
		}
		System.out.println(count);
	}
}