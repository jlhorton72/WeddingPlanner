/*
 * Name:        James
 * Date:        10/16/2018
 * Assignment:  Wedding Planner Exam 1
 * File:        WeddingPlannerApp.java
 */
package weddingplannerapp;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Redindianfred
 */
public class WeddingPlannerApp 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);        
        String bride;
        String guest;
        String groom;
        String location;
        String dte;        
        
        System.out.println("What is the Bride's Name?");
        bride = sc.nextLine();                     // inputs birdes name
        String[] split = bride.trim().split("\\s+");
        String brFn = split[0];
        String brLn = split[1];
        System.out.println("What is the Groom's Name?");    
        groom = sc.nextLine();                     // inputs the grooms name  
        String[] gsplit = groom.trim().split("\\s+");
        String gmFn = gsplit[0];
        String gmLn = gsplit[1];
        System.out.println("Date of wedding?");
        dte = sc.nextLine();                       // this will get/set the wedding date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        LocalDate dateTime = LocalDate.parse(dte, formatter);
        System.out.println("What is the location? ");
        location = sc.nextLine();                   // this sets the location
        System.out.println("Guest Name: [enter 'quit' to stop]");
        guest = sc.nextLine();                      // this will initialize the guests setup

        ArrayList<String> folks = new ArrayList<String>(); // this in string list of guests
        while (!guest.equals("quit"))               // this will build actual guests in order to create wedding
        {
            folks.add(new String(guest));
            System.out.println("Guest Name: [enter 'quit' to stop]");
            guest = sc.nextLine();

        } // end of while loop
        Wedding wed = new Wedding(brFn, brLn, gmFn, gmLn, location, dateTime, folks);  // this sends everything to wedding to generate
        wed.printWedding();                 // this prints the wedding
   
    } // end of main
    
} // end of WeddingPlannerApp
