//import utility package
import java.util.*;

public class Question3{
  public static void main(String[] args) {

    //instantiating objects
    String number;
    char ch1, ch2, ch3;
    int dig1, dig2, dig3;
    int sumOfDigits;
    Scanner sc = new Scanner (System.in);

    //header
    System.out.println("\n\n\n******CALCULATING THE SUM OF A WHOLE NUMBER WITH 3 DIGITS******\n\n\n");

    //getting information from user
    System.out.println("Please enter a whole number of 3 digits");
    number = sc.nextLine();

    //converting numbers to individual characters
    ch1 = number.charAt(0);
    ch2 = number.charAt(1);
    ch3 = number.charAt(2);
    dig1 = Integer.parseInt(String.valueOf(ch1));
    dig2 = Integer.parseInt(String.valueOf(ch2));
    dig3 = Integer.parseInt(String.valueOf(ch3));

    //formula and math
    sumOfDigits = dig1 + dig2 + dig3;

    //output
    System.out.println("\n\n\nThe sum of the 3 digits you have input is equal to " + sumOfDigits);



  }
}
