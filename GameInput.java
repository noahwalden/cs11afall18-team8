import java.util.Scanner;
public class GameInput {
  public static String letterInput() {
    Scanner myScanner = new Scanner(System.in);
    System.out.print("> ");
    String x = myScanner.nextLine().toLowerCase();
    while ((!x.equals("a")) && (!x.equals("b")) && (!x.equals("c")) && (!x.equals("d"))) {
      System.out.println("That answer is not valid. Please try again.");
      System.out.print("> ");
      x = myScanner.nextLine().toLowerCase();
    }
    return x;
  }
}
