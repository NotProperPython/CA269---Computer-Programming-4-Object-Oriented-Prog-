import java.util.Scanner;

public class Bigger

{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int result = num1;
        if(num2 > num1)
            result = num2;

        System.out.println(result + " is the biggest.");
    }
}