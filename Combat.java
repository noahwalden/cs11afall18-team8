import java.util.Scanner;

public class Combat{
  public static int health = 100;
  public static int power = 25;
  public static int defense = 25;

  /* Method use: In any room with an alien encounter, you need to define variables for the alien's health and power. Afterwards, call
   the method using Combat.fight(hp, pow) */
  public static void fight(int hp, int pow){
    Scanner myScanner = new Scanner(System.in);
    String item = Inventory.chooseItem();
    ItemStats.stats(item);
    System.out.println(ItemStats.description);
    System.out.println("You hit the alien with your " + item + "!");
    int totalDamage = power + ItemStats.power;
    if(item == "bananna"){
        totalDamage = 0;
        System.out.println("It does nothing... The alien starts laughing at you.");
    }
    int healthRemaining = hp - totalDamage;
    if (healthRemaining > 0) {
      alienFight(pow);
      System.out.println("The alien has "+ healthRemaining + " health remaining!");
      System.out.println("He's not dead! You hit him again.");
      System.out.println("Press <enter> to continue...");
      String uselessVariable = myScanner.nextLine();
      Game.clearConsole();
      fight(healthRemaining, pow);
    } else {
    System.out.println("The alien is dead!");
    System.out.println();
    System.out.println("You feel a little healthier after the fight. Your health and resistance to damage have increased!");
    System.out.println();
    health = health + ((hp/5) + (int)Math.floor(Math.random()*6.0));
    defense = defense + hp/5;
    System.out.println("HP Remaining: "+ health);
    System.out.println("Current Defense: "+ defense);
    }
  }

  private static void alienFight(int alienPow){
    Scanner myScanner = new Scanner(System.in);
    System.out.println("The alien swings in retaliation!");
    System.out.println();
    int damage =  defense - ((int)Math.floor(Math.random()*6.0) + alienPow);
    health = health + damage;
    System.out.println("You took "+ damage/-1 +" points of damage!");
    System.out.println("You now have "+ health +" health remaining!");
    System.out.println("Press <enter> to continue...");
    String uselessVariable = myScanner.nextLine();
  }
}
