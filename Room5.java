//Surveillance room
import java.util.Scanner;
public class Room5 {

  public static boolean hasExplored = false;

public static void Room5(){
  System.out.println();
  if hasExplored{
    System.out.println("You have already explored this room.");
    System.out.println();
    leaveRoom();
  }
}

  public static void main (String[] args) {
    Scanner myScanner = new Scanner(System.in);

    System.out.println();
    System.out.println("SURVEILLANCE ROOM:");
    System.out.println();
    System.out.println("You enter a room filled with screens showing different parts of the ship.");
    System.out.println("You notice alien symbols which you can't comprehend.");
    System.out.println("You see a red button, what to do?");
    System.out.println();
    System.out.println("To press the button, press p.");
    System.out.println("To leave it alone, press l.");
    System.out.println();

    String firstDecision = myScanner.nextLine();
    switch(firstDecision) {
      case "p":
      System.out.println();
      System.out.println("Well done. All the cameras are now shut down");
      break;
      case "l":
      System.out.println();
      System.out.println("You watch the screen and notice guards may be coming your way, it's time to go.");
      break;
    }
    System.out.println();
    System.out.println("You see another door going South.");
    System.out.println("To enter the new room, press s.");
    System.out.println("To return to the Barracks, press b.");
    String secondDecision = myScanner.nextLine();
    switch(secondDecision) {
      case "s":
      case "b":
    }

    private static void leaveRoom() {
      System.out.println("Which door do you want to leave through?");
      System.out.println("  A) The Eastern door");
      System.out.println("  B) The Southern door");
      System.out.println("  C) The Western door");

  }
}
