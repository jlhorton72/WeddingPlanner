/*
 * Name:        James
 * Date:        10/16/2018
 * Assignment:  Wedding Planner Exam 1
 * File:        Couple.java
 */
//package weddingplannerapp;
/**
 *
 * @author Redindianfred
 */
public class Couple 
{
    Person bride;
    Person groom;
    
    public Couple(String nmBride, String nmGroom)
    {
        this.bride = new Person(nmBride);
        this.groom = new Person(nmGroom);
    } // end of Couple    

} // end of couple class
