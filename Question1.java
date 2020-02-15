//import Scanner class from utility package
import java.util.Scanner;

  public class Question1{
     public static void main(String[] args) {

       //instantiating objects
       double distanceTravelled;
       double distancePerLiter;
       double litersNeeded;
       double costOfTrip;
       final double GAS_PRICE_PER_LITER = 1.16;
       Scanner sc = new Scanner (System.in);

       //header
       System.out.println("\n\n\n******ROAD TRIP PRICE CALCULATOR******\n\n\n");

       //Getting information from the traveler
       System.out.println("Please enter the distance to be travelled in KM");
       distanceTravelled = sc.nextDouble();
       System.out.println("Please enter the amount of KM that can be travelled"
                         +"with 1L of gas");
       distancePerLiter = sc.nextDouble();

       //Formulas and math
       litersNeeded = distanceTravelled / distancePerLiter;
       costOfTrip = litersNeeded * GAS_PRICE_PER_LITER;

       //Output
       System.out.printf("This road trip will cost you: %.2f",  costOfTrip);
       System.out.print("CAD");











    }

  }
