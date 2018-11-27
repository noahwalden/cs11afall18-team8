import java.util.Scanner;
public class GameInput {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("> ");
    String input = myScanner.nextLine();
    switch(input) {
      case "north":
      case "n":
        return input; break;
      case "east":
      case "e":
      case "south":
      case "s":
      case "west":
      case "w":
    }

  }
}
