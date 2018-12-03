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
    switch(firstDecision) {
      case "a": pressButton(); break;
      case "b": doNothing(); break;
    }
    leaveRoom();
  }

  private static void roomDescription(){
    System.out.println();
    System.out.println("CANNONS:");
    System.out.println();
    System.out.println("You enter to find a huge blaster cannon");
    System.out.println("Inside the cannon you see a sign pointing at a unknown target.");
    System.out.println("Do you:");
    System.out.println("  A. Try to use the gun.");
    System.out.println("  B. Leave it be and move on.");
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
    System.out.println("What do you do?");
    System.out.println("  A) Make your way back to the surveillance room");
    System.out.println("  B) Enter the sleeping quarters");
    System.out.println("  C) Enter the bridge");
    String secondDecision = myScanner.nextLine();
    secondDecision = secondDecision.toLowerCase();
    while ((!answer.equals('a' + "")) && (!answer.equals('b' + "")) &&
    (!answer.equals('c' + ""))) {
      System.out.println("That answer is not valid. Please try again.");
      answer = input.nextLine();
      System.out.println();
      System.out.println();
      answer = answer.toLowerCase();
    }
    switch(secondDecision) {
      case "a":
        Room4.room4();
        break;
      case "b":
        Room6.room6(4);
        break;
      case "c":
        Room6.room6(4);
        break; //create room 2 class
    }
  }
}
