public class Game {
  public static void main(String[] args) {
    introSequence();
    prisonCell();
  }
  public static void introSequence() {
    System.out.println("The Boolin' Operators' Text Adventure Game");
    System.out.println("Professor: Timothy Hickey");
    System.out.println("Created on Nov. 27, 2018");
  }
  public static void prisonCell() {
    RoomDescriptions.prisonCell();
    String userInput = GameInput.prisonCell();
    switch(userInput) {
      case "e": barracks();
      default: GameInput.error();
    }
  }
}
