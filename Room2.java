import java.util.Scanner;

public class Room6 {

  public static boolean hasExplored = false;
  private static int alienHP = 500;
  private static int alienPow = 50;

  private static int lastRoom = 0;

  public static void room6() {
    System.out.println();
    if (hasExplored) {
      System.out.println("You have already explored this room.");
      System.out.println();
      leaveRoom();
    }
    else {
      System.out.println("You enter the room and find yourself in what appears to");
      System.out.println("be the sleeping quarters of the ship.");
      System.out.println("An alien sleeps in one of the beds across the room.");
      System.out.println();
      firstChoice();
    }
  }

  private static void firstChoice() {
    boolean hasLooked = false;
    String answer = "a";
    while (answer.equals('a' + "")) {
      System.out.println("What do you do?");
      System.out.println("  A) Look around for more details.");
      System.out.println("  B) Kill the alien in his sleep.");
      System.out.println("  C) Try to sneak past the alien.");
      Scanner response = new Scanner(System.in);
      answer = response.nextLine();
      System.out.println();
      System.out.println();
      answer = answer.toLowerCase();
      while ((!answer.equals('a' + "")) && (!answer.equals('b' + "")) &&
      (!answer.equals('c' + ""))) {
        System.out.println("That answer is not valid. Please try again.");
        answer = response.nextLine();
        System.out.println();
        System.out.println();
        answer = answer.toLowerCase();
      }
      if (answer.equals('a' + "")) {
        if (!hasLooked) {
          lookAround();
          hasLooked = true;
        }
        else {
          System.out.println("There's nothing else to see here.");
          System.out.println();
        }
      }
      else if (answer.equals('b' + "")) {
        fightAlien();
      }
      else {
        sneakPast();
      }
    }
  }
  private static void lookAround() {
    System.out.println("You look around and see a lead pipe on the floor.");
    System.out.println("Do you pick it up?");
    System.out.println("  A) Yes");
    System.out.println("  B) No");
    Scanner input = new Scanner(System.in);
    String answer = input.nextLine();
    System.out.println();
    System.out.println();
    answer = answer.toLowerCase();
    while ((!answer.equals('a' + "")) && (!answer.equals('b' + ""))) {
      System.out.println("That answer is not valid. Please try again.");
      answer = input.nextLine();
      System.out.println();
      System.out.println();
      answer = answer.toLowerCase();
    }
    if (answer.equals('a' + "")) {
      Inventory.addToInventory("lead pipe");
    }
  }

  private static void sneakPast() {
    System.out.println("You attempt to sneak past the alien.");
    System.out.println();
    int chanceWakesUp = (int)Math.floor(Math.random()*101);
    if (chanceWakesUp >= 75) {
      sneakSuccess();
    }
    else {
      fightAlien();
    }
  }

  private static void sneakSuccess() {
    System.out.println("You successfully sneak past the alien!");
    leaveRoom();
  }

  private static void fightAlien() {
    Game.clearConsole();
    System.out.println("The alien wakes up!");
    System.out.println("Quick, hit him with something!");
    System.out.println();
    Combat.fight(alienHP, alienPow);
    leaveRoom();
  }

  private static void leaveRoom() {
    hasExplored = true;
    System.out.println("Which door do you want to leave through?");
    System.out.println("  A) The Eastern door");
    System.out.println("  B) The Southern door");
    System.out.println("  C) The Western door");
    Scanner input = new Scanner(System.in);
    String answer = input.nextLine();
    System.out.println();
    System.out.println();
    answer = answer.toLowerCase();
    while ((!answer.equals('a' + "")) && (!answer.equals('b' + "")) &&
    (!answer.equals('c' + ""))) {
      System.out.println("That answer is not valid. Please try again.");
      answer = input.nextLine();
      System.out.println();
      System.out.println();
      answer = answer.toLowerCase();
    }
    if (answer.equals('a' + "")) {
      Room7.room7();
    }
    else if (answer.equals('b' + "")) {
      Room3.room3();
    }
    else {
      Room4.room4();
    }
  }
}
