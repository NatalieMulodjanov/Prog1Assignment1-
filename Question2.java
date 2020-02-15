//import utility package
import java.util.*;

  public class Question2{
    public static void main(String[] args){

      //instantiating objects
      double priceOnReceipt;
      double TPSandTVQ = 0.15;
      final double tip = 0.15;
      double totalAmount;
      Scanner sc = new Scanner (System.in);

      //header
      System.out.println("\n\n\n******TAX AND TIP CALCULATOR******\n\n\n");

      //getting information from user
      System.out.println("Please enter the bill amount on the receipt");
      priceOnReceipt = sc.nextDouble();

      //Formulas and math
      totalAmount = priceOnReceipt + priceOnReceipt*TPSandTVQ + priceOnReceipt*tip;

      //Output
      System.out.printf("The total amount you need to pay including tax and tip is: %.2f",
                        totalAmount);




    }

}
