import java.util.Scanner;

public class Room8 {
  public static boolean hasLooked = false;
  public static boolean hasExplored = false;
  public static boolean cardPickup = false;

  public static void main(String[] args) {
    room8();
  }
  public static void room8() {
    System.out.println();
    if (hasExplored) {
      System.out.println("You have already explored this room.");
      System.out.println();
      leaveRoom();
    }
    else {
      System.out.println(RoomDescriptions.prisonCell());
      if (cardPickup == False) {
        System.out.println("A keycard is lying on the ground.");
      }
      System.out.println();
      firstChoice();
    }
  }

  private static void chooseAction() {
    hasExplored = true;
    while (answer.equals('a' + "")) {
      System.out.println("What do you do?");
      System.out.println("  A) Look around for more details.");
      System.out.println("  B) Exit through the door to the east.");
      System.out.println("  C) Pick up the keycard.");
      System.out.println("  D) Call for help.");
      answer = GameInput.letterInput();
    }
    switch(answer) {
      case "a": lookAround(); break;
      case "b": Room1(); break; //Call to Room1 class file
      case "c": getKeycard(); break;
      case "d": callHelp(); break;
    }
  }

  private static void lookAround() {
    if (!hasLooked) {
      hasLooked = true;
      System.out.println("The cell is dimly lit. Through a small circular window,");
      System.out.println("you're able to see the vast expanse of space.");
    } else {
      System.out.println("There's nothing else to see here.");
      System.out.println();
    }
  }

  private static void getKeycard() {
    System.out.println("You pick up the keycard.");
    System.out.println();
    Inventory.addToInventory("keycard");
    }
  }

}
