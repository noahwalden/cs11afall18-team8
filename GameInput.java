import java.util.Scanner;
public class GameInput {
  public static String letterInput(String input) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("> ");
    String x = myScanner.nextLine().toLowerCase();
    while ((!x.equals("a")) && (!x.equals("b")) && (!x.equals("c")) && (!x.equals("d"))) {
      System.out.println("That answer is not valid. Please try again.");
      System.out.println("> ");
      input = myScanner.nextLine().toLowerCase();
    }
    return input;
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
        System.out.println("You must now ");
    }

  }
}
