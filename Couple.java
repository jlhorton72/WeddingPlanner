/*
 * Name:        James
 * Date:        10/16/2018
 * Assignment:  Wedding Planner Exam 1
 * File:        Couple.java
 */
package weddingplannerapp;
/**
 *
 * @author Redindianfred
 */
public class Couple 
{
    Person bride;
    Person groom;
    
    public Couple(String fnmBride, String lnmBride, String fnmGroom, String lnmGroom )
    {
        this.bride = new Person(fnmBride, lnmBride);
        this.groom = new Person(fnmGroom, lnmGroom);
    } // end of Couple    

} // end of couple class
