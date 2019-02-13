import java.util.*;

public class SumNumber
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//System.out.print("Enter a number: ");
		int n = in.nextInt();
		int total = 0;
		for(int i=1; i<=n; i++)
		{
			total += i;
		}
	System.out.println("The sum of the numbers from 1 to " + n + " is " + total);
	}

}