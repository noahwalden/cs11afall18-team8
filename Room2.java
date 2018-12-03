import java.util.Scanner;

public class Room2 {

  public static boolean hasExplored = false;
  private static boolean hasEncountered = false;
  private static boolean hasYelled = false;
  private static boolean isFinalBoss = false;
  private static int alienHP = 500;
  private static int alienPow = 50;
  private static Scanner myScanner = new Scanner(System.in);

  private static int lastRoom = 0;

  public static void room2() {
    if (hasExplored) {
      endSequence();
    }
    else {
      Game.clearConsole();
      System.out.println("...");
      System.out.println("The room is pitch black when you enter.");
      System.out.println("You hear water dripping from the ceiling.");
      System.out.println("There are heavy footsteps coming from the darkness...");
      System.out.println();
      System.out.print("Press <enter> to continue...");
      String uselessVariable = myScanner.nextLine();
      choice();
    }
  }

  private static void choice() {
    String answer = "a";
    while (answer.equals('a' + "")) {
      System.out.println("What do you do?");
      System.out.println("  A) Yell into the darkness.");
      System.out.println("  B) Just walk in.");
      Scanner response = new Scanner(System.in);
      answer = response.nextLine();
      System.out.println();
      System.out.println();
      answer = answer.toLowerCase();
      while ((!answer.equals('a' + "")) && (!answer.equals('b' + ""))) {
        System.out.println("That answer is not valid. Please try again.");
        answer = response.nextLine();
        System.out.println();
        System.out.println();
        answer = answer.toLowerCase();
      }
      if (answer.equals('a' + "")) {
        if (!hasYelled) {
          yell();
          hasYelled = true;
        }
        else {
          System.out.println("You've already done that.");
          System.out.println();
        }
      }
      else if (answer.equals('b' + "")) {
        if (!hasEncountered){
          finalBossSequence();
          hasEncountered = true;
        }
        else {
          Game.clearConsole();
          System.out.println("You return to the fight! Hopefully with a better plan this time...");
          System.out.print("Press <enter> to continue...");
          String uselessVariable = myScanner.nextLine();
          Combat.fight(alienHP, alienPow, isFinalBoss);
        }
      }
    }
  }
  private static void yell() {
    System.out.println("You yell 'Hey! Is anyone there!' into the darkness...");
    System.out.println("No response...");
    System.out.print("Press <enter> to continue...");
    String uselessVariable = myScanner.nextLine();
  }

  private static void finalBossSequence() {
    System.out.println("You muster up the courage to explore the room.");
    System.out.println("You walk around the room until you bump into something.");
    System.out.println("...");
    System.out.println("...");
    System.out.println("...");
    System.out.println();
    System.out.print("Press <enter> to continue...");
    String uselessVariable = myScanner.nextLine();
    Game.clearConsole();
    Combat.fight(alienHP, alienPow, isFinalBoss);
    Game.clearConsole();
    endSequence();
  }

  private static void endSequence() {
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
