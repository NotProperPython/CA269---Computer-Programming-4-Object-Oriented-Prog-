import java.util.*;

public class StringReproduction
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer and a string: ");
		int n = in.nextInt();
		String s = in.next();
		for (int i=0; i<n; i++)
		{
			System.out.print(s);
		}

		System.out.println();

	}
}