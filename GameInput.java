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

  // room 5 action
  public static void Choice5(String[] args) {
    System.out.println("You see a red button, what to do?");
    System.out.println("To press the button, press p. To leave it alone, press l");
    String input = myScanner.nextLine();
    switch(input) {
      case "p":
        System.out.println("All the cameras are now shut down");
      case "l":
        System.out.println("You notice guards may be coming your way, it's time to go");
    }
    System.out.println("You see another door going South.");
    System.out.println("To enter the new room, press s.");
    System.out.println("To return to the Barracks, press b.");
    String input = myScanner.nextLine();
    switch(input) {
      case "s":
        System.out.println("You now enter an unknown room");
      case "b":
    }

  }
}
