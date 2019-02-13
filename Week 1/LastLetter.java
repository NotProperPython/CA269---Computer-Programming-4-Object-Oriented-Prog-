import java.util.Scanner;

public class LastLetter
{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = in.next();
        int nameLen = name.length();
        System.out.println("The last letter of your name is " + name.substring(nameLen-1, nameLen) + ".");
        
        // Use the substring() method of the String class.
    }
}
