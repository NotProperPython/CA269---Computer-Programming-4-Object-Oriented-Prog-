
import java.util.Scanner;

public class InitialLess

{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Tell me your name: ");
        String name = in.next();
        int nameLen = name.length();
        System.out.println("Initialless, your name is " + name.substring(1, nameLen) + ".");
        
        // Use the substring() method of the String class.
    }
}