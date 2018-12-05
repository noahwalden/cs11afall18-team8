import java.util.Scanner;

public class Room2 {

  public static boolean hasExplored = false;
  private static boolean hasEncountered = false;
  private static boolean hasYelled = false;
  private static boolean isFinalBoss = true;
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
    System.out.println();
  }

  private static void finalBossSequence() {
    Game.clearConsole();
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
    hasExplored = true;
    endSequence();
  }

  private static void endSequence() {
    Game.clearConsole();
    System.out.println("After beating the alien, you run through a path that had just opened up.");
    System.out.println("Your keep running for what seems like ages until you reach a small room.");
    System.out.println("In this room, there is what looks to be a clear crystal platform you can stand on, with a button next to it.");
    finalChoice();
  }

  private static void finalChoice(){
    String answer = "a";
    while (answer.equals('a' + "")) {
      System.out.println("What do you do?");
      System.out.println("  A) Step onto the pad and press the button.");
      System.out.println("  B) Turn back and stay on the ship.");
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
      if(answer.equals('a' + "")){
        Game.clearConsole();
        System.out.println("You decide to get on the pad and press the button.");
        System.out.println("All you see is a bright blinding light and you feel as if you are floating.");
        System.out.println("After some time, you fall onto the ground with considerable force.");
        System.out.println("You then realize that you're back at your house and you walk in..");
        System.out.println("Your friends are still there watching the game and as you go to sit down they as you:");
        System.out.println("'Where's the chips and dip?'");
        System.out.print("Press <enter> to continue...");
        String uselessVariable = myScanner.nextLine();
        end();
        answer = "";
      }
      if(answer.equals('b' + "")){
        System.out.println("You think to yourself: 'No way I'm getting on that thing!' and decide to stay on the ship.");
        System.out.println("You walk back to where you fought the final alien and you see other aliens gathering around the body.");
        System.out.println("They turn to you, and before you had a chance to react they...");
        System.out.println("Bow to you!?");
        System.out.println("It seems that whoever kills their leader is crowned as the new one.");
        System.out.println("As their new leader, you quickly become accustomed to their language and culture.");
        System.out.println("You see no reason to return to earth so you stay with your new alien bretheren.");
        System.out.println("Meanwhile, your friends on earth are wondering why you're taking so long to get the chips and dip.");
        System.out.print("Press <enter> to continue...");
        String uselessVariable = myScanner.nextLine();
        System.out.println("Meanwhile, your friends on earth are wondering why you're taking so long to get the chips and dip.");
        end();
        answer = "";
      }
    }
  }

  private static void end(){
    Game.clearConsole();
    System.out.println("Thank you for playing!");
    System.out.println("Credits:");
    System.out.println("Martin Sipowicz");
    System.out.println("Elijah Miller");
    System.out.println("Noah Walden");
    System.out.println("Charles Beyrard");
    System.out.println("Lisandro Mayancela");
    System.out.print("Press <enter> to end...");
    String uselessVariable = myScanner.nextLine();
    return;
  }
}
