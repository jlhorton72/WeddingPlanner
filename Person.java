/*
 * Name:        James
 * Date:        10/16/2018
 * Assignment:  Wedding Planner Exam 1
 * File:        Person.java
 */
package weddingplannerapp;

/**
 *
 * @author Redindianfred
 */
public class Person 
{
    private String fname;
    private String lname;
        
    public Person(String inNname, String lNm)
    {
        this.fname = inNname;
        this.lname = lNm;
    } // end of Person
    
    public String getName()
    {
        String name = fname + " " + lname;
        return name;
    } // end of getName
    
} // end of Person class
