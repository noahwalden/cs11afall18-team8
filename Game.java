import java.util.Scanner;
public class Game {
  public static void main(String[] args) {
    introSequence();
    prisonCell();
  }
  public static void introSequence() {
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
  public static void prisonCell() {
    RoomDescriptions.prisonCell();
    String userInput = GameInput.prisonCell();
    switch(userInput) {
      case "e": barracks();
      default: GameInput.error();
    }

  private static void backstory() {
    System.out.printf("Superbowl Sunday, 1995. You and your buddies had all%n
                      gathered at your house to watch the big game. At halftime,%n
                      you decide to leave the house and swing by the store for%n
                      more chips and dip. As you walk back from the convenience%n
                      store to the car, a bright suddenly appears directly above%n
                      your head, blinding you.");
  }
}
