import java.util.Scanner;

public class OneToNum
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int i=1;
		while (i<(n+1))
		{
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
	}

}