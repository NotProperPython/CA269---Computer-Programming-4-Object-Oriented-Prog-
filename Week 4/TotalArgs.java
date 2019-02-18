/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Umer
 */
public class TotalArgs {
    public static void main(String [] args)
    {
        int argsLen = args.length;
        int total = 0;
        for(int i=0; i<argsLen; i++)
        {
            total += Integer.parseInt(args[i]);
        }
        System.out.println("The sum of all the args is " + total + ".");
    }
}
