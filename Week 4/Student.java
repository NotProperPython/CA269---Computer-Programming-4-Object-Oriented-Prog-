/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Umer
 */
public class Student
{
   private String name;
   private int mark;

   public Student(String n, int m)
   {
      name = n;
      mark = m;
   }
   
   public String getName()
   {
      return name;
   }

   public int getMark()
   {
      return mark;
   }
}
