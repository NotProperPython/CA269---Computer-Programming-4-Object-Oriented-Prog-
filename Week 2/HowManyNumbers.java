import java.util.Scanner;

public class HowManyNumbers
{
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		int i = in.nextInt();
		int count = 0;
		while (i != -1)
		{
			count++;
			i = in.nextInt();

		}
		System.out.print(count + " numbers were entered.");
		System.out.println();
	}
}