import java.util.Scanner;

public class Lab5_BirthMonth
{
    public static void main(String[] args)
    {
       // Importing the scanner for input

        Scanner in = new Scanner(System.in);

      // Declare variables

      int month = 0;
      String trash = "";

      // User input and prompting

        System.out.print("Enter the number of the month you were born: ");

        if(in.hasNextInt()) {
            month = in.nextInt();
            in.nextLine(); // Clears Buffer
        }
             if (month <= 12 && month != 0) {

                System.out.println("\nYour birth month is: " + month);
            }
        if(month > 12) {
            trash = in.nextLine();
            System.out.println("\nYou said your birth month was: " + month);
            System.out.println("Please run the program again and enter a valid month.");
        }

    }

}
