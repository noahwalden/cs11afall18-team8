import java.util.Scanner;

public class Inventory {

  public static String[] inventory = {"empty","empty","empty","empty","empty"};

  public static void printInventory() {
    for (int i = 0; i < inventory.length; i++) {
      System.out.prinln("Inventory");
      System.out.printf("Slot %d: %8s",i + 1,inventory[i]);
    }
  }

  public static void addToInventory(String item) {
    boolean full = checkIfFull();
    if (full) {
      System.out.println("Your inventory is full!");
      System.out.print("Do want to drop an item from your inventory?(enter \"yes\" or \"no\")");
      String answer = input.nextLine();
      if(answer.equalsIgnoreCase("yes")) {
        dropFromInventory();
      }
      else {
        return;
      }
    }

    Scanner input = new Scanner(System.in);
    main while (true) {
      System.out.print("Enter the number of the inventory slot where you want to store this item: ");
      int slot = input.nextInt();
      while (slot < 1 || slot > 5) {
        System.out.println("That is not a valid slot number. Please try again.");
        slot = input.nextInt();
      }
      if (inventory[slot-1].equalsIgnoreCase("empty")) {
        inventory[slot-1] = item;
        break main;
      }
      else {
        System.out.println("There's already something in this slot!");
        System.out.println("Please pick a different slot.");
      }
    }
  }

  public static void dropFromInventory() {
    boolean empty = checkIfEmpty();
    if (empty) {
      System.out.println("Your inventory is empty!");
      return;
    }
    Scanner input = new Scanner(System.in);
    main while (true) {
      System.out.print("Enter the number of the inventory slot whose contents you want to drop: ");
      int slot = input.nextInt();
      while (slot < 1 || slot > 5) {
        System.out.println("That is not a valid slot number. Please try again.");
        slot = input.nextInt();
      }
      if (!inventory[slot-1].equalsIgnoreCase("empty")) {
        inventory[slot-1] = "empty";
        System.out.print("Do want to drop another item?(enter \"yes\" or \"no\")");
        String answer = input.nextLine();
        if(!answer.equalsIgnoreCase("yes")) {
          break main;
        }
      }
      else {
        System.out.println("There is nothing in this slot!");
        System.out.println("Please pick a different slot.");
      }
    }
  }

  private static boolean checkIfFull() {
    boolean isFull = true;
    for (int i = 0; i < inventory.length; i++) {
      if (inventory[i].equalsIgnoreCase("empty")) {
        isFull = false;
      }
    }
    return isFull;
  }

  private static boolean checkIfEmpty() {
    boolean isEmpty = true;
    for (int i = 0; i < inventory.length; i++) {
      if (inventory[i].equalsIgnoreCase("empty")) {
        isEmpty = false;
      }
    }
    return isEmpty;
  }
}
