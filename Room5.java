//Surveillance room
import java.util.Scanner;
public class Room5 {

  public static void Choice5(String[] args) {

    System.out.println("You see a red button, what to do?");
    System.out.println("To press the button, press p. To leave it alone, press l");
    String firstDecision = myScanner.nextLine();
    switch(firstDecision) {
      case "p":
      System.out.println("All the cameras are now shut down");
      case "l":
      System.out.println("You notice guards may be coming your way, it's time to go");
    }
    System.out.println("You see another door going South.");
    System.out.println("To enter the new room, press s.");
    System.out.println("To return to the Barracks, press b.");
    String secondDecision = myScanner.nextLine();
    switch(secondDecision) {
      case "s":
      case "b":
    }

  }
}
