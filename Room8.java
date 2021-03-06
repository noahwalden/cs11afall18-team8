import java.util.Scanner;

public class Room8 {
  public static boolean hasLooked = false;
  public static boolean hasExplored = false;
  public static boolean cardPickup = false;
  public static boolean help = false;

  public static void room8() {
    System.out.println();
    if (hasExplored) {
      System.out.printf("Since you already explored the cell, you decide to leave.%n");
      Room1.room1();
    } else {
      RoomDescriptions.prisonCell();
      if (!cardPickup) {
        System.out.println("A keycard is resting on the ground.");
      }
      chooseAction();
    }
  }

  private static void chooseAction() {
    hasExplored = true;
      System.out.println("What do you do?");
      System.out.println("  A) Look around for more details.");
      System.out.println("  B) Go through the cell door.");
      System.out.println("  C) Call for help.");
      if (!cardPickup) {
        System.out.println("  D) Pick up the keycard.");
      }
      String answer = GameInput.letterInput();
      System.out.println();

      switch(answer) {
        case "a": lookAround(); break;
        case "b":
          if (cardPickup) {
            System.out.println("You swipe the keycard and the cell door swings open.");
            Combat.randomEncounter();
            Room1.room1();
          } else {
            System.out.println("The door is locked tight.");
            chooseAction();
          }
          break; //Call to Room1 class file
        case "c": callHelp(); break;
        case "d":
          getKeycard(); break;
      }
    }

  private static void lookAround() {
    if (!hasLooked) {
      hasLooked = true;
      System.out.println("The cell is dimly lit. Through a small circular window,");
      System.out.println("you're able to see the vast expanse of space.");
    } else {
      System.out.println("There's nothing else to see here.");
    }
    chooseAction();
  }

  private static void getKeycard() {
    if (!cardPickup) {
      cardPickup = true;
      System.out.println("You pick up the keycard.");
      System.out.println();
      Inventory.addToInventory("keycard");
      Inventory.printInventory();
    } else {
      System.out.println("You already have the keycard.");
    }
    chooseAction();
  }

  private static void callHelp() {
    if (!help) {
      help = true;
      String line = "You call out for help, but you receive no response other\n" +
                    "than your own voice echoing back at you.";
      System.out.println(line);
    } else {
      System.out.println("It's clear that no one is coming to help you.");
    }
    chooseAction();
  }
}
