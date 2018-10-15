/*
 * Name:        James
 * Date:        10/16/2018
 * Assignment:  Wedding Planner Exam 1
 * File:        Guest.java
 */
package weddingplannerapp;
import java.time.LocalDate;
/**
 *
 * @author Redindianfred
 */
public class Guest 
{
    Person guest;
    LocalDate date; 
    
   public final LocalDate now()
   {
       LocalDate thedate = LocalDate.now();
       return thedate;
   } // end of now  

    public Guest(String fname, String lName)            
    {
        this.guest = new Person(fname, lName);
        this.date = now();     
    } // end of Guest
    
} // end of Guest Class
