import java.util.*;
public class Test
{
	public static int [] reverse(int [] array)
		{
			int arrayLen = array.length;
			int tmp;
			for(int i=0; i<(arrayLen/2); i++)
			{
				tmp = array[i];
				array[i] = array[arrayLen-1-i];
				array[arrayLen-1-i] = tmp;
			}
			return array;
		}

	public static int countEven(int [] array)
		{
			int arrayLen = array.length;
			int count = 0; 
			for(int i=0; i<arrayLen; i++)
			{
				if(array[i] % 2 == 0)
				{
					count += 1;
				}
			}
			return count;

		}


	public static int countFives(int [] array)
	{
		int arrayLen = array.length;
		int count = 0; 
		for(int i=0; i<arrayLen; i++)
		{
			if(array[i] == 5)
			{
				count += 1;
			}
		}
		return count;

	}


	public static int getSum(int [] array)
	{
		int arrayLen = array.length;
		int sum = 0;
		for(int i=0; i<arrayLen; i++)
		{
			sum = sum + array[i];
		}
		return sum;
	}

	public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int len = in.nextInt();
        
        int [] num = new int[len];
        System.out.print("Enter " + len + " numbers: ");
        for(int i = 0; i < num.length; i++)
            num[i] = in.nextInt();
            
        Test.reverse(num);

        System.out.print("The numbers reversed are:");
        for(int i = 0; i < num.length; i++)
            System.out.print(" " + num[i]);
            
        System.out.println();
    }
}
