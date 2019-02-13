import java.util.Scanner;

public class NoMinusOne
{
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		int i = in.nextInt();
		int prev = 0;
		while (i != -1)
		{
			prev = i;
			i = in.nextInt();
		}
		System.out.print("The penultimate number was: " + prev);
		System.out.println();
	}
}