/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Umer
 */
public class ReverseArgs {
    public static void main(String [] args)
    {
        int argsLength = args.length;
        for(int i=argsLength-1; i>=0; i--)
        {
            System.out.println("args[" + i + "]" + " = " + args[i]);
        }
    }
}
