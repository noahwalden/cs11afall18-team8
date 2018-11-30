//Surveillance room
import java.util.Scanner;
public class Room5 {

  public static boolean hasExplored = false;

  public static void Room5(){
    System.out.println();
    if(hasExplored){
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
    System.out.println();
    String secondDecision = myScanner.nextLine();
    switch(secondDecision) {
      case "s":
      case "b":
    }
  }

  private static void leaveRoom(){
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Which door do you want to leave through?");
    System.out.println("  A) The Southern door");
    System.out.println("  B) Back to the barracks");

    String thirdDecision = myScanner.nextLine();
    thirdDecision = thirdDecision.toLowerCase();
    while ((!thirdDecision.equals('a' + "")) && (!thirdDecision.equals('b' + "")) &&
    (!thirdDecision.equals('c' + ""))) {
      System.out.println("That answer is not valid. Please try again.");
      thirdDecision = input.nextLine();
      System.out.println();
      System.out.println();
      answer = thirdDecision.toLowerCase();
    }
    if (thirdDecision.equals('a' + "")) {
      //use room1 method
    }
    else if (answer.equals('b' + "")) {
      //use room4 method
    }
  }
}
