 import java.util.Scanner;

public class Room1 {
  public static boolean hasLooked = false;
  public static boolean hasExplored = false;
  public static boolean getbanana = false;

  public static void room1() {
    System.out.println();
    if (hasExplored) {
      System.out.println("You have already explored this room.");
      System.out.println();
      leaveRoom();
    } else {
      RoomDescriptions.barracks();
      chooseAction();
    }
  }

private static void chooseAction() {
  hasExplored = true;
  System.out.println("What do you do?");
  System.out.println("  A) Look around");
  System.out.println("  B) Leave room");
  System.out.println("  C) Pick up the banana.");
  System.out.println("  D) Go Back to your cell");
  String answer = GameInput.letterInput();
  System.out.println();
  switch(answer) {
    case "a": lookAround(); break;
    case "b": leaveRoom(); break; //Call to Room1 class file
    case "c": getbanana(); break;
    case "d": goback(); break;
  }
}

private static void lookAround() {
  if (!hasLooked) {
    hasLooked = true;
    System.out.println("The barracks have many futuristic weapons these weapons include plasma torpedos, bananas, and pipes.");
    chooseAction();
  } else {
    System.out.println("There's nothing else to see here.");
    System.out.println();
    chooseAction();
  }
}

private static void getbanana() {
  if (getbanana == false) {
    getbanana = true;
    System.out.println("You pick up the banana");
    System.out.println();
    Inventory.addToInventory("banana");
    Inventory.printInventory();
  }
  else {
    System.out.println("You already have that banana");
  }

  chooseAction();
  }
private static void leaveRoom() {
  System.out.println("Which door do you want to leave through?");
  System.out.println("  A) The The Eastern Door");
  System.out.println("  B) The Western Door");
  Scanner input = new Scanner(System.in);
  String answer = input.nextLine();
  System.out.println();
  System.out.println();
  answer = answer.toLowerCase();
  while ((!answer.equals('a' + "")) && (!answer.equals('b' + "")) ) {
    System.out.println("That answer is not valid. Please try again.");
    answer = input.nextLine();
    System.out.println();
    System.out.println();
    answer = answer.toLowerCase();
  }
  if (answer.equals('b' + "")) {
    Room5.room5();
  }
  else if (answer.equals('a' + "")) {
    Room7.room7();
  }
}
private static void goback() {
  System.out.println("ARE YOU AN IDIOT");
  chooseAction();
}
}
