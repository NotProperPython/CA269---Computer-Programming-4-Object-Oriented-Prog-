/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Umer
 */
/**
 public class Test
{
   public static void print(Student [] student)
   {
      for(int i = 0; i < student.length; i++)
         System.out.println(student[i].name);
   }
}

**/

/**
 public class Test
{
   public static void print(Student [] student)
   {
      for(int i = 0; i < student.length; i++)
         System.out.println(student[i].mark);
   }
}

**/

/**
 public class Test
{
   public static void print(Student [] student)
   {
      for(int i = 0; i < student.length; i++)
         System.out.println(student[i].mark + " (" +student[i].name+")");
   }
}

**/

/**
public class Test
{
   public static void print(Student [] student)
   {
      for(int i = 0; i < student.length; i++)
         System.out.println(student[i].getMark() + " (" +student[i].getName()+")");
   }
}
**/

/**
public class Test
{
   public static void printHonours(Student [] student)
   {
      for(int i = 0; i < student.length; i++)
        if(student[i].getMark() >= 55)
            System.out.println(student[i].getMark() + " (" +student[i].getName()+")");
   }
}
**/

/**
public class Test
{
   public static void printForties(Student [] student)
   {
      for(int i = 0; i < student.length; i++)
        if(40 <= student[i].getMark() && student[i].getMark() <= 49)
            System.out.println(student[i].getMark() + " (" +student[i].getName()+")");
   }
}
**/

/**
public class Test
{
    public static int numberPasses(Student [] student)
    {
        int count = 0;
        for(int i=0; i<student.length; i++)
            if(student[i].getMark() >= 40)
                count += 1;
        return count;
    }
}
**/

/**
public class Test
{
    public static Student getBestStudent(Student [] student)
    {
        int bestMark = 0;
        for(int i=0; i<student.length; i++)
            if(student[i].getMark() > bestMark)
                bestMark = student[i].getMark();
        int bestStudent = 0;
        for(int i=0; i<student.length; i++)
            if(student[i].getMark() == bestMark)
                return student[i];
        return student[0];
    }
}
**/

/**
public class Test
{
    public static double getPassingAverage(Student [] student)
    {
        int passingStudentCount = 0;
        double totalMarks = 0;
        for(int i=0; i<student.length; i++)
            if(student[i].getMark() >= 40)
            {
                passingStudentCount += 1;
                totalMarks += student[i].getMark();
            }
        return totalMarks / passingStudentCount;
    }
}
**/





