import java.util.Scanner;
public class Room4 {

  public static boolean hasDestroyedEarth = false;

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

  private static void action(){
    Scanner myScanner = new Scanner(System.in);
    roomDescription();
    String firstDecision = myScanner.nextLine();
    firstDecision = firstDecision.toLowerCase();
    switch(firstDecision) {
      case "a": pressButton(); break;
      case "b": doNothing(); break;
      default: System.out.println("Invalid answer. Please input one of the two letters");
    }
    leaveRoom();
  }

  private static void roomDescription(){
    System.out.println();
    System.out.println("Ship's weapon system:");
    System.out.println();
    System.out.println("You enter to find a huge blaster cannon");
    System.out.println("Inside the cannon you see a sign pointing at a unknown target.");
    System.out.println("Do you:");
    System.out.println(" A. Try to use the gun.");
    System.out.println(" B. Leave it be and move on.");
    System.out.println("Press a to use the gun, or b to leave it alone");
  }

  private static void pressButton(){
    hasDestroyedEarth = true;
    System.out.println("The target was Earth. You just killed 7 billion people.");
    System.out.println("You hear mumbling, the sound of which is increasing. You must leave.");
  }

  private static void doNothing(){
    System.out.println("You hear mumbling, the sound of which is increasing. You must leave.");
  }

  private static void leaveRoom(){
    Scanner myScanner = new Scanner(System.in);
    System.out.println("To make your way back to the surveillance room, press s.");
    System.out.println("To enter the sleeping quarters, press q.");
    String secondDecision = myScanner.nextLine();
    secondDecision = secondDecision.toLowerCase();
    switch(secondDecision) {
      case "s": Room5.room5(); break;
      case "q": Room6.room6(); break;
      default: System.out.println("Invalid answer. Please input one of the two letters");
    }
  }
}
