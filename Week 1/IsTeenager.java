import java.util.Scanner;

public class IsTeenager

{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        boolean teenager = 12 < age && age < 20;
        if(teenager)
            System.out.println("You are a teenager.");
        else
            System.out.println("You are not a teenager.");
    }
}