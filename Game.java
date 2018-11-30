import java.util.Scanner;
public class Game {
  public static void main(String[] args) {
    introSequence();
    Room8.main();
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
  }

  private static void backstory() {
    String line = "Superbowl Sunday, 1995. You and your buddies had all" +
                  "gathered at your house to watch the big game. At halftime," +
                  "you decide to leave the house and swing by the store for" +
                  "more chips and dip. As you walk back from the convenience" +
                  "store to the car, a bright suddenly appears directly above" +
                  "your head, blinding you. The last thing you remember is being" +
                  "sucked up into the hull of an enormous disk-shaped alien" +
                  "craft. Waking up in your cell, you begin to look for ways" +
                  "to escape.";

    System.out.println(line);
  }
}
