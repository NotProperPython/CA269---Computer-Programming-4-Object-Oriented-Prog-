import java.util.Scanner;

public class NumToTwenty
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = in.nextInt();
		int i = n;
		while (i<21)
		{
			System.out.print(i+" ");
			i++;
		}

		System.out.println();

	}


}
