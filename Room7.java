import java.util.Scanner;

public class Room7 {
  public static boolean hasLooked = false;
  public static boolean hasExplored = false;
  public static boolean getbanana = false;

  public static void room7() {
    System.out.println();
    if (hasExplored) {
      System.out.println("You have already explored this room.");
      System.out.println();
      leaveRoom();
    }
    else{
      RoomDescriptions.room7();
      chooseAction();
    }
  }

private static void chooseAction() {
  hasExplored = true;
  System.out.println("What do you do?");
  System.out.println("  A) Stay where you are");
  System.out.println("  B) Leave room");
  System.out.println("  C) Admire the view");

  String answer = GameInput.letterInput();
  switch(answer) {
    case "a": stay(); break;
    case "b": leaveRoom(); break; //Call to Room1 class file
    case "c": view(); break;
  }
}

private static void stay() {
  System.out.println("Why are you doing that RUNNNN A SHIP is DOCKING");
  chooseAction();
}

private static void view() {
  System.out.println("Wow what a a view but you should probably get going");
  System.out.println();
  chooseAction();
}
private static void leaveRoom() {
  System.out.println("Which door do you want to leave through?");
  System.out.println("  A) The Eastern door");
  System.out.println("  B) Stay where you are");
  Scanner input = new Scanner(System.in);
  String answer = input.nextLine();
  System.out.println();
  System.out.println();
  answer = answer.toLowerCase();
  while ((!answer.equals('a' + "")) && (!answer.equals('b' + "")) ) {
    System.out.println("That answer is not valid. Please try again.");
    answer = input.nextLine();
    System.out.println();
    System.out.println();
    answer = answer.toLowerCase();
  }
  if (answer.equals('a' + "")) {
    Room6.room6();
  }
  else if (answer.equals('b' + "")) {

  }
}

}
