//Surveillance room
import java.util.Scanner;
public class Room5 {

  public static boolean hasPressedButton = false;

  public static void room5(){
    System.out.println();
    if(hasPressedButton){
      System.out.println("There is nothing more to do in this room.");
      System.out.println();
      leaveRoom();
    }else{
      action();
    }
  }

  private static void action() {
    Scanner myScanner = new Scanner(System.in);
    roomDescription();
    String firstDecision = myScanner.nextLine();
    firstDecision = firstDecision.toLowerCase();
    switch(firstDecision) {
      case "a": pressButton(); break;
      case "b": doNothing(); break;
      default: System.out.println("Invalid answer. Please input one of the two letters.");
    }
    leaveRoom();
  }

  private static void roomDescription(){
    System.out.println();
    System.out.println("Surveillance Room");
    System.out.println("You enter a room filled with 8 screens showing different parts of the ship.");
    System.out.println("You notice alien symbols which you can't comprehend.");
    System.out.println("You see a red button.");
    System.out.println("What do you do?");
    System.out.println(" A) Press the button.");
    System.out.println(" B) Leave it alone.");
  }
  private static void pressButton(){
    hasPressedButton = true;
    System.out.println();
    System.out.println("Well done. All the cameras are now shut down.");
    System.out.println("You hear footsteps. It's time to go.");
  }

  private static void doNothing(){
    System.out.println();
    System.out.println("You watch the screen and notice guards may be coming");
    System.out.println("your way. It's time to go.");
  }

  private static void leaveRoom(){
    Scanner myScanner = new Scanner(System.in);
    System.out.println();
    System.out.println("Do you:");
    System.out.println(" A) Go through the South door.");
    System.out.println(" B) Return to the Barracks.");
    System.out.println();
    String secondDecision = myScanner.nextLine();
    secondDecision = secondDecision.toLowerCase();
    switch(secondDecision) {
      case "a": Combat.randomEncounter(); Room4.room4(); break;
      case "b": Combat.randomEncounter(); Room1.room1(); break;
      default: System.out.println("Invalid answer. Please input one of the two letters");
    }
  }
}
