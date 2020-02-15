//import java utility package
import java.util.*;

public class Question4 {
  public static void main(String[] args) {

    //instantiating objects
    String webSite;
    int webSiteLength;
    Scanner sc = new Scanner (System.in);

    //header
    System.out.println("\n\n\n******URL verifier******\n\n\n" +
                        "This program will tell you if your URL address is valid and secure");

    //getting input from user
    System.out.println("\n\n\nPlease enter a URL address\n" +
                        "Your website URL should begin with http://");
    webSite = sc.nextLine();
    webSite = webSite.trim();
    webSiteLength = webSite.length();

    //output
    System.out.println("\n\n\nThis is a valid and secure URL:" + webSite.startsWith("http://"));
    System.out.println("\n\n\nIf: true \n congradulations, your website is valid and secure"
                        +"\n\nIf: false \n try to modify your URL to begin with http://");
  }
}
