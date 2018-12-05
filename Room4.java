//Ship's Weapon System.
import java.util.Scanner;
public class Room4 {

  public static boolean hasDestroyedEarth = false;

//method which determines if user should or shouldn't go back into the room
  public static void room4() {
    System.out.println();
    if(hasDestroyedEarth){
      System.out.println("You have already explored this room.");
      System.out.println();
      leaveRoom();
    }else{
      Room4.action();
    }
  }

//user enters the room
  private static void action(){
    Scanner myScanner = new Scanner(System.in);
    roomDescription();
    String firstDecision = myScanner.nextLine();
    System.out.println();
    firstDecision = firstDecision.toLowerCase();
    switch(firstDecision) {
      case "a": pressButton(); break;
      case "b": doNothing(); break;
      default: System.out.println("Invalid answer. Please input one of the two letters.");
    }
    leaveRoom();
  }

//introduction
  private static void roomDescription(){
    System.out.println();
    System.out.println("Ship's Weapon System");
    System.out.println("You enter to find a huge blaster cannon.");
    System.out.println("Inside the cannon you see a sign pointing at a unknown target.");
    System.out.println("Do you:");
    System.out.println(" A) Try to use the gun.");
    System.out.println(" B) Leave it be and move on.");
  }

//Option A
  private static void pressButton(){
    hasDestroyedEarth = true;
    System.out.println("The target was Earth. You just killed 7 billion people.");
    System.out.println("You hear mumbling, the sound of which is increasing. You must leave.");
  }

//Option B
  private static void doNothing(){
    System.out.println("You hear mumbling, the sound of which is increasing. You must leave.");
  }

//method to leave room
  private static void leaveRoom(){
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Do you:");
    System.out.println(" A) Make your way back to the surveillance room.");
    System.out.println(" B) Enter the sleeping quarters.");
    String secondDecision = myScanner.nextLine();
    secondDecision = secondDecision.toLowerCase();
    switch(secondDecision) {
      case "a": Combat.randomEncounter(); Room5.room5(); break;
      case "b": Combat.randomEncounter(); Room6.room6(); break;
      default: System.out.println("Invalid answer. Please input one of the two letters.");
    }
  }
}
