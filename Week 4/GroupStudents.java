/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Umer
 */
public class GroupStudents
{
   public static void main(String [] args)
   {
      Student [] group = {
               new Student("John", 50),
               new Student("Abby", 40),
               new Student("Dylan", 20),
            };

      double passingAverage = test.getPassingAverage(group);
      System.out.println("The average mark of all students who passed is " + passingAverage);
   }
}

