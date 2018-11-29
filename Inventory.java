import java.util.Scanner;

public class Inventory {

  public static String[] inventory = {"empty","empty","empty","empty","empty"};

  public static void printInventory() {
    System.out.println("Inventory");
    for (int i = 0; i < inventory.length; i++) {
      System.out.printf("Slot %d: %8s%n",i + 1,inventory[i]);
    }
  }

  public static void addToInventory(String item) {
    printInventory();
    boolean full = checkIfFull();
    if (full) {
      System.out.println("Your inventory is full!");
      System.out.println("Do want to drop an item from your inventory?");
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
      if(answer.equals('a' + "")) {
        dropFromInventory();
      }
      else {
        return;
      }
    }

    Scanner input = new Scanner(System.in);
    while (true) {
      System.out.print("Enter the number of the inventory slot where you want to store this item: ");
      int slot = input.nextInt();
      System.out.println();
      System.out.println();
      while (slot < 1 || slot > 5) {
        System.out.println("That is not a valid slot number. Please try again.");
        slot = input.nextInt();
        System.out.println();
        System.out.println();
      }
      if (inventory[slot-1].equalsIgnoreCase("empty")) {
        inventory[slot-1] = item;
        break;
      }
      else {
        System.out.println("There's already something in this slot!");
        System.out.println("Please pick a different slot.");
      }
    }
  }

  public static void dropFromInventory() {
    printInventory();
    boolean empty = checkIfEmpty();
    if (empty) {
      System.out.println("Your inventory is empty!");
      return;
    }
    Scanner input = new Scanner(System.in);
    while (true) {
      System.out.print("Enter the number of the inventory slot whose contents you want to drop: ");
      int slot = input.nextInt();
      System.out.println();
      System.out.println();
      while (slot < 1 || slot > 5) {
        System.out.println("That is not a valid slot number. Please try again.");
        slot = input.nextInt();
        System.out.println();
        System.out.println();
      }
      if (!inventory[slot-1].equalsIgnoreCase("empty")) {
        inventory[slot-1] = "empty";
        System.out.print("Do want to drop another item?");
        System.out.println("  A) Yes");
        System.out.println("  B) No");
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
        if(!answer.equals('a' + "")) {
          break;
        }
      }
      else {
        System.out.println("There is nothing in this slot!");
        System.out.println("Please pick a different slot.");
      }
    }
  }

  public static void accessInventory() {
    printInventory();
    System.out.println();
    System.out.println("Would you like to drop an item from you inventory?");
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
      dropFromInventory();
    }
  }

  public static String chooseItem() {
    printInventory();
    boolean empty = checkIfEmpty();
    if (empty) {
      System.out.println("Your inventory is empty! You'll have to use your fists.");
      System.out.println();
      return "fist";
    }
    while (true) {
      System.out.print("Enter the number of the inventory slot whose item you'd like to use: ");
      Scanner input = new Scanner(System.in);
      int slot = input.nextInt();
      System.out.println();
      System.out.println();
      while (slot < 1 || slot > 5) {
        System.out.println("That is not a valid slot number. Please try again.");
        slot = input.nextInt();
        System.out.println();
        System.out.println();
      }
      if (inventory[slot-1].equalsIgnoreCase("empty")) {
        System.out.println("There is nothing in this slot!");
        System.out.println("Please pick a different slot.");
      }
      else {
        return inventory[slot-1];
      }
    }
  }

  public static boolean checkIfFull() {
    boolean isFull = true;
    for (int i = 0; i < inventory.length; i++) {
      if (inventory[i].equalsIgnoreCase("empty")) {
        isFull = false;
      }
    }
    return isFull;
  }

  public static boolean checkIfEmpty() {
    boolean isEmpty = true;
    for (int i = 0; i < inventory.length; i++) {
      if (!inventory[i].equalsIgnoreCase("empty")) {
        isEmpty = false;
      }
    }
    return isEmpty;
  }
}
