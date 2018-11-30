import java.util.Scanner;
public class Game {
  public static void main(String[] args) {
    clearConsole();
    introSequence();
    Room8.room8();
  }
  private static void introSequence() {
    System.out.println("The Boolin' Operators' Text Adventure Game");
    System.out.println("Professor: Timothy Hickey");
    System.out.printf("Created on Nov. 27, 2018%n");

    Scanner ms = new Scanner(System.in);
    System.out.println("Show intro sequence? (y/n): ");
    String input = ms.nextLine();
    if(input.equals("y")) {
      backstory();
    }
    clearConsole();
  }

  private static void backstory() {
    Scanner myScanner = new Scanner(System.in);
    String line = "Superbowl Sunday, 1995. You and your buddies had all\n" +
                  "gathered at your house to watch the big game. At halftime,\n" +
                  "you decide to leave the house and swing by the store for\n" +
                  "more chips and dip. As you walk back from the convenience\n" +
                  "store to the car, a bright light suddenly appears directly above\n" +
                  "your head, blinding you. The last thing you remember is being\n" +
                  "sucked up into the hull of an enormous disk-shaped alien\n" +
                  "craft. Waking up in your cell, you begin to look for ways\n" +
                  "to escape.\n";

    System.out.println(line);
    System.out.println("Press <enter> to continue...");
    String uselessVariable = myScanner.nextLine();
  }

  public static void clearConsole() {
    System.out.print("\033[H\033[2J");
  }
}
