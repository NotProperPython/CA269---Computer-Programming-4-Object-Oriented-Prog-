
import java.util.Scanner;

public class ReducedString

{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer and a string: ");
        int num = in.nextInt();
        String name = in.next();

        System.out.println(name.substring(0, num) +name.substring(num + 1));
        
        // Use the substring() method of the String class.
    }
}