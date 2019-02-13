import java.util.Scanner;

public class EvenOdd

{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        String result = "odd";
        if((num % 2) == 0)
            result = "even";

        System.out.println(num + " is " + result + ".");
    }
}