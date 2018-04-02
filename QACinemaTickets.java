/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tickets;

/**name
 *movie
 *ticket type 
 *visit
 *seats
 
 * @author USER
 */
import java.util.Scanner;
public class QACinemaTickets {
    
   static Scanner scan = new Scanner(System.in);
   static String[] tickets = {"1) Standard", "2) OAP", "3) Student", "4) Child"};
           
   public static void getName(){
   System.out.println("Please input your name?");
   String name = scan.nextLine();
   System.out.println("Hello " + name +", Welcome to QA Cinemas!");    
   } 
   public static void getMovie(){
   System.out.println("Please enter the movie you would like to watch?");
   String movie = scan.nextLine();
   System.out.println("Thank you, you would like to see " + movie );    
   }  
   public static void getTickets(){
   System.out.println("Please select the ticket you would like to purchase");
       for (String ticket : tickets) {
           System.out.println(ticket);
       }    
   int number = scan.nextInt();
   System.out.println(tickets[number-1] + "You have selected the ");
   }  
   public static void main(String[] args) {
    getName();
    getMovie();
    
   
           }
    
    
    }




