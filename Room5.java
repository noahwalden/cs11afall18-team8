//Surveillance room
import java.util.Scanner;
public class Room5 {

  public static boolean hasPressedButton = false;

  public static void Room5(){
    System.out.println();
    if(hasPressedButton){
      System.out.println("There is nothing more to do in this room.");
      System.out.println();
      leaveRoom();
    }else{
      Room5.action();
    }
  }

  private static void action() {
    Scanner myScanner = new Scanner(System.in);
    roomDescription();
    String firstDecision = myScanner.nextLine();
    switch(firstDecision) {
      case "p": pressButton(); break;
      case "l": doNothing(); break;
    }
    leaveRoom();
  }

  private static void roomDescription(){
    System.out.println();
    System.out.println("SURVEILLANCE ROOM:");
    System.out.println();
    System.out.println("You enter a room filled with 8 screens showing different parts of the ship.");
    System.out.println("You notice alien symbols which you can't comprehend.");
    System.out.println("You see a red button, what to do?");
    System.out.println();
    System.out.println("To press the button, press p.");
    System.out.println("To leave it alone, press l.");
    System.out.println();
  }
  private static void pressButton(){
    hasPressedButton = true;
    System.out.println();
    System.out.println("Well done. All the cameras are now shut down.");
    System.out.println("You hear footsteps, it's time to go.");
  }

  private static void doNothing(){
    System.out.println();
    System.out.println("You watch the screen and notice guards may be coming your way, it's time to go.");
  }

  private static void leaveRoom(){
    Scanner myScanner = new Scanner(System.in);
    System.out.println();
    System.out.println("To go South and enter another room, press s.");
    System.out.println("To return to the Barracks, press b.");
    System.out.println();
    String secondDecision = myScanner.nextLine();
    switch(secondDecision) {
      case "s": Room4.room4(); break;
      case "b": Room1.room1(); break;
    }
  }
}
