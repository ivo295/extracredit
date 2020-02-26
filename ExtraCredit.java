/*
Ivo Simeonov
Advanced Programing
Practice Extra Credit 
04/12/2017

I did not recive any unapproved outside assistance in completing this assignemnt. 
*/ 

import java.util.Arrays;
import java.util.Scanner;
public class ExtraCredit{

   public static void main (String [] args) {
   
      String []name = new String[10];
      int []grade = new int[10];
   
     
      prompt(name,grade);
      System.out.println("Students grades are: ");
     
      for(int i =0; i<name.length; i++)
         System.out.println(name[i] +" "+ grade[i]);
         
      System.out.println();   
      System.out.println("Average is: "+average(grade));   
      System.out.println("Highest grade is: "+high(name, grade));
      System.out.println("Lowest grade is: "+low(grade)); 
    
      System.out.println(); 
      System.out.println("Sorted values are:"); 
    
      sort(name,grade);
   
   }
   
   public static void prompt(String []name, int []grade)
   {
   
      Scanner scan = new Scanner(System.in);
      for(int i =0; i<grade.length; i++)
      {
         
         System.out.println("Enter the name and grade for student #"+(i+1)+":");
         
         name [i] = scan.next();
         grade [i] = scan.nextInt();
         
         if(grade[i] < 0 || grade[i] > 100)
         {
            System.out.println("Only enter grades between 0-100(Re-enter the grade):");
            grade [i] = scan.nextInt();
         }
      
      }
   } 
   public static double average(int [] grade)
   {
   
      double total = 0;
      double avg = 0;
   
      for(int i =0; i<grade.length; i++)
      {
         total = total + grade[i];
      }
      avg = (total / grade.length);
   
      return avg;
   
   }
   public static int high(String name[] , int grade [])
   {
    
      int high =0;
      int h =0;
 
      System.out.print("Students scoring the highest grade: ");
      for(int i =0; i<grade.length; i++)
      {
      
         if(high <= grade[i])
         {
            high = grade[i];
           
            if (high >= grade[i])
            {
            
             System.out.print(name[i] + ",");
           
            }
         }
         
      }
      System.out.println();
      
      return high;
   }
   public static int low(int grade [])
   {
    
      int low = grade[0];
    
      for(int i =0; i<grade.length; i++)
      {
      
         if(grade[i] < low)
            low = grade[i];
      
      }
      return low;
   }
   public static void sort(String name[], int grade[])
   {
   
      Arrays.sort(grade);
   
      for(int i =0; i<grade.length;i++)
      {
         System.out.println(name[i] + " " +grade[i]);
      }
   }
   
                 // if(count >= name[i].length())
             //  System.out.print(":"+name[i] );
  
}
