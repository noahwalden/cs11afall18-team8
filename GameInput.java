import java.util.Scanner;
public class GameInput {
  public static void prisonCell(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("> ");
    String input = myScanner.nextLine();
    switch(input) {
      case "north":
      case "n":
        return "n"; break;
      case "east":
      case "e":
        return "e"; break;
      case "south":
      case "s":
        return "s"; break;
      case "west":
      case "w":
        return "w"; break;
      case ""
    }
  }

  public static void error() {
    System.out.println("Sorry, you can't do that.");
  }
}
