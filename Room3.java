import java.util.Scanner;
/* Author: Elijah Miller
This is the cafeteria.



There is no violence in the cafeteria
*/
public class Room3 {

  public static boolean hasExplored = false;
  public static boolean hasPumpkin = false;

  public static void room3() {
    System.out.println();
    if (hasExplored) {
      System.out.println("You have already explored this room.");
      System.out.println();
      leaveRoom();
    }
    else {
      System.out.println("You've found the cafeteria!");
      System.out.println("An alien sits at a table eating a piece of apple strudel.");
      firstChoice();
    }
  } //end of method

  private static void firstChoice() {
    boolean hasLooked = false;
    String answer = "a";
    while (answer.equals('a' + "")) {
      System.out.println("What do you do?");
      System.out.println("  A) Look around for more details.");
      System.out.println("  B) Sit down to eat with the alien.");
      System.out.println("  C) Raid the kitchen for yams.");
      Scanner response = new Scanner(System.in);
      answer = response.nextLine();
      System.out.println();
      System.out.println();
      answer = answer.toLowerCase();
      while ((!answer.equals('a' + "")) && (!answer.equals('b' + "")) &&
      (!answer.equals('c' + ""))) {
        System.out.println("That answer is not valid. Please try again.");
        answer = response.nextLine();
        System.out.println();
        System.out.println();
        answer = answer.toLowerCase();
      }
      if (answer.equals('a' + "")) {
        if (hasLooked && hasPumpkin) {
          System.out.println("There's nothing else to see here.");
        } else {
          lookAround();
          hasLooked = true;
        }
      }
      else if (answer.equals('b' + "")) {
        sitDown();
      }
      else {
        getYams();
      }
    }
  } //end of method

  private static void lookAround() {
    System.out.println("You look around and see a pumpkin on the table.");
    System.out.println("Do you pick it up?");
    System.out.println("  A) Yes");
    System.out.println("  B) No");
    Scanner input = new Scanner(System.in);
    String answer = input.nextLine();
    System.out.println();
    System.out.println();
    answer = answer.toLowerCase();
    while ((!answer.equals('a' + "")) && (!answer.equals('b' + ""))) {
      System.out.println("That answer is not valid. Please try again.");
      answer = input.nextLine();
      System.out.println();
      System.out.println();
      answer = answer.toLowerCase();
    }
    if (answer.equals('a' + "")) {
      hasPumpkin = true;
      Inventory.addToInventory("pumpkin");
    }
  } //end of method

  private static void sitDown() {
    System.out.println("You get yourself a piece of strudel and");
    System.out.println("have a nice lunch with the alien.");
    leaveRoom();
  } //end of method

  private static void getYams() {
    int yams = (int)Math.floor(Math.random()*6.0);
    System.out.printf("You raid the kitchen and find %d yams.%n",yams);
    System.out.println();
    System.out.println("Congradulations.");
    System.out.println();
    leaveRoom();
  } //end of method

  private static void leaveRoom() { //method to bring up the exit options
    hasExplored = true; //hasExplored is assigned the value true once the player decides to leave the room
    System.out.println("Which door do you want to leave through?");
    System.out.println("  A) The northern door");
    System.out.println("  B) The western door");
    Scanner input = new Scanner(System.in);
    String answer = input.nextLine();
    System.out.println();
    System.out.println();
    answer = answer.toLowerCase();
    while ((!answer.equals('a' + "")) && (!answer.equals('b' + ""))) {
      System.out.println("That answer is not valid. Please try again.");
      answer = input.nextLine();
      System.out.println();
      System.out.println();
      answer = answer.toLowerCase();
    }
    Combat.randomEncounter();
    if (answer.equals('a' + "")) {
      Room6.room6(); //call to room 6
    }
    else {
      Room2.room2(); //call to room 2
    }
  } //end of method
} //end of class
