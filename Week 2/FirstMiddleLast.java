import java.util.*;

public class FirstMiddleLast
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String s = in.next();
		int len_s = s.length();
		System.out.println(s.substring(0,1));
		System.out.println(s.substring(1,len_s-1));
		System.out.println(s.substring(len_s-1,len_s));
	}

}