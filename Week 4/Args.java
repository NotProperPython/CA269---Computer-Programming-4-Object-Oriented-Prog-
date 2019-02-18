/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Umer
 */
public class Args {
    
    public static void main(String [] args)
    {
        int i = 0;
        for(String arg: args)
        {
            System.out.println("args[" + i + "]" + " = " + arg);
            i++;
        }
    }  
}
