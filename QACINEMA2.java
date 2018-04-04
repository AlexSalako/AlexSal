/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qacinema;
import java.util.Scanner;
import java.util.Date;
import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author USER
 */
public class QACINEMA2{

static Scanner scan = new Scanner(System.in);
static String name;
static String movie;    

private static void getName(){
     System.out.println("Please enter your name: "); 
     name = scan.nextLine();
     System.out.println("Hello "+name +", Welcome to QA Cinemas");
    }
public static void fullPrice(){
    int STANDARD = 8;
    int OAP = 6;
    int STUDENT = 6;
    int CHILD = 4;
    
    
}
public static void ticketType(){
     Scanner ticketType = new Scanner (System.in);
     System.out.println("Which ticket would you like to purchase?");
     System.out.print("Please enter 0 for Standard Ticket, 1 for OAP, 2 for Student, 3 for Child");
     int ticketT = ticketType.nextInt();
     int[] ticket = {0, 1, 2, 3};
     
     String[] tickets = {"ERROR", "STANDARD", "OAP", "STUDENT", "CHILD"};
     int i = ticketT -1;
     System.out.println("You have selected to purchase the "+ tickets[i] +" TICKET(S) to view " +movie);
}
public static void ticketNumber(){
     Scanner numberTicket = new Scanner (System.in);
     System.out.println("How many tickets would you like?");
     int numberOfTickets = numberTicket.nextInt();
     
     int[] tickets = {1, 2, 3, 4, 5, 6, 7, 8};
     int i = numberOfTickets;
     System.out.println("You have selected "+tickets[i]+ " tickets to watch " +movie);
    }
    
private static void ticketPrices(){
    HashMap<String, Integer>ticketPrices = new HashMap<String, Integer>();
    ticketPrices.put("STANDARD", 8);
    ticketPrices.put("OAP", 6);
    ticketPrices.put("STUDENT", 6);
    ticketPrices.put("CHILD", 4);
    
}  
private static String counter = "Wednesday";
ArrayList<String> wednesdayDisc=new ArrayList<String>();
ArrayList<Integer> discValue=new ArrayList<Integer>();

public static void wednesdayDiscount(){
  System.out.println("Which day would you like to visit QA Cinemas: ");
  Scanner day = new Scanner(System.in);
  String booking = day.nextLine();
  if(booking != "Wednesday"){
      System.out.println("Tickets are full price today.");
  }
  else{
      System.out.println("Today you get £2 off all QA Cinema tickets!!!");
  }
}
        
   
     public static void main(String[] args){
     System.out.println("Welcome to the QA Cinema booking system");
     getName();
     System.out.println("Please enter the name of the movie you would like to watch: ");
     movie = scan.nextLine();
     System.out.println("You have to selected to watch the "+ movie);
     ticketType();
     ticketNumber();
     wednesdayDiscount();
}   
    

    //Array of 16 tickets, 4 tickets per type, 4x Standard, 4x OAP, 4x Student, 4x Child.
   
       
   
   
    
}
