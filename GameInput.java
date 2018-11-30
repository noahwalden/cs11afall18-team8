import java.util.Scanner;
public class GameInput {
  public static String letterInput() {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("> ");
    String x = myScanner.nextLine().toLowerCase();
    while ((!x.equals("a")) && (!x.equals("b")) && (!x.equals("c")) && (!x.equals("d"))) {
      System.out.println("That answer is not valid. Please try again.");
      System.out.println("> ");
      x = myScanner.nextLine().toLowerCase();
    }
    return x;
  }

  // room 5 action
  public static void Choice5(String[] args) {

    System.out.println("You see a red button, what to do?");
    System.out.println("To press the button, press p. To leave it alone, press l");
    String input = myScanner.nextLine();
    switch(input) {
      case "p":
        System.out.println("All the cameras are now shut down, well done.");
      case "l":
        System.out.println("You must now ");
    }

  }
}
