import java.util.Scanner;

public class Room8 {
  public static boolean hasLooked = false;  
  public static boolean hasExplored = false;
  public static boolean cardPickup = false;
  public static boolean help = false;

  public static void room8() {
    System.out.println();
    if (hasExplored) {
      System.out.printf("You have already explored this room.%n");
      Room1.room1();
    } else {
      RoomDescriptions.prisonCell();
      chooseAction();
    }
  }

  private static void chooseAction() {
    String answer;
    hasExplored = true;
      System.out.println("What do you do?");
      System.out.println("  A) Look around for more details.");
      System.out.println("  B) Exit through the door to the east.");
      System.out.println("  C) Call for help.");
      if (!cardPickup) {
        System.out.println("  D) Pick up the keycard.");
      }
      answer = GameInput.letterInput();

      switch(answer) {
        case "a": lookAround(); break;
        case "b": Room1.room1(); break; //Call to Room1 class file
        case "c": callHelp(); break;
        case "d":
          getKeycard(); break;
      }
    }

  private static void lookAround() {
    if (!hasLooked) {
      hasLooked = true;
      System.out.println("The cell is dimly lit. Through a small circular window,");
      System.out.println("you're able to see the vast expanse of space.\n");
    } else {
      System.out.println("There's nothing else to see here.");
      System.out.println();
    }
    chooseAction();
  }

  private static void getKeycard() {
    if (!cardPickup) {
      cardPickup = true;
      System.out.println("You pick up the keycard.");
      System.out.println();
      Inventory.addToInventory("keycard");
    } else {
      System.out.println("You already have the keycard.");
    }
    chooseAction();
  }

  private static void callHelp() {
    if (!help) {
      String line = "You call out for help, but you receive no response other\n" +
                    "than your own voice echoing back at you.\n";
      System.out.println(line);
    } else {
      System.out.println("It's clear that no one is coming to help you.");
      System.out.println();
    }
    chooseAction();
  }
}
