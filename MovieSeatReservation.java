/** 
 * This program allows users to reserve seats for a movie theater
 * Author: Ursula Vaughn
 */

 import java.util.Scanner;

 public class MovieSeatReservation {
 
   /** @param args the command line arguments */
 
   public static void main(String[] args) {
 
     // Create a Scanner object to read user input
     try (Scanner sc = new Scanner(System. in )) {
 
       // Print welcome message
       System.out.println("\t \t MOVIE SEAT RESERVATION");
       System.out.println("------------------------------------------------------------");
       System.out.println(""); // line spacing
       // Initialize the seat matrix, which will store reservation status for each seat
       char matrix[][] = new char[11][10];
 
       // loop for column fields
       for (int column = 1; column <= 4; column++) {
         System.out.print("      Seat " + column + "\t");
       }
       System.out.println();
 
       // loop for row fields
       for (int rownum = 1; rownum <= 10; rownum++) {
         System.out.print("Row " + (rownum) + "\t");
 
         // loop for printing asteriks
         for (int col = 1; col <= 4; col++) {
           matrix[rownum][col] = '*'; // Initialize all seats to available
           System.out.print(matrix[rownum][col] + "\t\t");
 
         }
         System.out.println();
 
       }
       while (true) {
 
         System.out.println("");
         System.out.print("Enter the row and seat separated by a space; ");
         int x = sc.nextInt();
         int y = sc.nextInt();
         System.out.println("row " + x); //read row number
         System.out.println("seat: " + y); //read seat number
         if ((x > 0 && y > 0))
 
         {
           System.out.println("\n \t\t MOVIE SEAT RESERVATION");
           System.out.println("------------------------------------------------------------");
           System.out.println();
 
           for (int column = 1; column <= 4; column++)
 
           {
             System.out.print("      Seat " + column + "\t");
           }
           System.out.println();
           System.out.println("------------------------------------------------------------");
 
           for (int rownum = 1; rownum <= 10; rownum++)
 
           {
             System.out.print("Row " + (rownum) + "\t");
             for (int column = 1; column <= 4; column++)
 
             {
               matrix[x][y] = 'x'; // Mark the reserved seat as 'x'
               System.out.print(matrix[rownum][column] + "\t\t");
             }
             System.out.println();
 
           }
         } else {
           // If the user entered invalid input, break out of the loop
           System.out.println("Program Has Stopped: Thank you!");
           break;
         }
         System.out.println("You have successfully reserved your movie seat!");
         System.out.print("Do you want to reserver another seat? Y or N ");
         char yn = sc.next().charAt(0);
         if (yn == 'y' || yn == 'Y') {
           continue;
         } else {
           // If the user doesn't want to reserve another seat, exit the program
           System.out.println("Enjoy the movie!:");
           break;
         }
       }
     }
   }
 
 }