package finalqacinema;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class FinalQACinema1 {

    static Scanner scan = new Scanner(System.in);
    static String name;
    static String movie;
    static int[] tickets = {1, 2, 3, 4, 5, 6, 7, 8};

    public static void getName(){
     System.out.println("Please enter your name: ");
     name = scan.nextLine();
     System.out.println("Hello "+name +", Welcome to QA Cinemas");
    }
    public static void getMovie(){
     System.out.println("Please enter the name of the movie you would like to watch: ");
     movie = scan.nextLine();
     System.out.println("You have to selected to watch the "+ movie);
    }
    public static void ticketNumber(){
     Scanner numberTicket = new Scanner (System.in);
     System.out.println("How many tickets would you like?");
     int numberOfTickets = numberTicket.nextInt();

     int[] tickets = {1, 2, 3, 4, 5, 6, 7, 8};
     int i = numberOfTickets -1;
     System.out.println("You have selected "+tickets[i]+ " tickets to watch " +movie);
    }
    public static void cinemaVisit(){
     Scanner customerInput = new Scanner (System.in);
     System.out.println("Select the day you would like to visit QA Cinemas: ");
     int dayVisit = customerInput.nextInt();

     String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
     int i = dayVisit -1;
     System.out.println("You have selected to visit QA Cinemas on "+ days[i]);
    }
    public static void main(String[] args) {
     getName();
     getMovie();
     ticketNumber();
     cinemaVisit();
