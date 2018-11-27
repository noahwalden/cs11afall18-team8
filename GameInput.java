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

  // room 5 choices
  public static void Choice5(String[] args) {
    String input = myScanner.nextLine();
    System.out.println("You see a red button, what to do?");
    System.out.println("To press the button, press p. To leave it alone, press l");
    switch(input) {
      case "p":
        System.out.println("All the cameras are now shut down, well done.");
      case "l": 
        System.out.println("You must now ")
    }

  }
}
