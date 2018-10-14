/*
 * Name:        James
 * Date:        10/16/2018
 * Assignment:  Wedding Planner Exam 1
 * File:        Wedding.java
 */
//package weddingplannerapp;
import java.util.ArrayList;
import java.time.LocalDate;
/**
 *
 * @author Redindianfred
 */
public class Wedding 
{
    ArrayList<Guest> Guests = new ArrayList<Guest>();       
    Couple cple; 
    LocalDate dte;
    public String location;    
    
    public Wedding(String bride, String groom, String local, LocalDate indate, ArrayList<String> theList)
    {
        this.cple = new Couple(bride, groom);
        this.location = local;
        this.dte = indate; 
        for (String party: theList)
        {
            Guests.add(new Guest(party));
        }
    } // end of Wedding
    
    public void printWedding()
    {
        System.out.println("Details of " + cple.groom.getName() + " and " + cple.bride.getName() + " Wedding");
        System.out.println("The wedding will be held at " + location);
        System.out.println(dte);
        for (Guest gsts: Guests)
        {
            System.out.println(gsts.guest.getName() + " RSVP'd: " + gsts.date);
        } // end of foreach
    } // end of printWedding
    
} // end of Wedding class
