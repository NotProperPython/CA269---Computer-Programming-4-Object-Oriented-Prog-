import java.util.*;

public class Reverse
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		System.out.print("How many numbers: ");

		int num = in.nextInt();

		System.out.print("Enter " + num + " numbers: ");

		int [] numbers = new int [num];

		for(int i=0; i<num; i++)
		{
			numbers[i] = in.nextInt();
		}

		System.out.print("The numbers reversed are:");

		for(int i=num-1; i>=0; i--)
		{
			System.out.print(" " + numbers[i]);
		}
		System.out.println();
	}

}