import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Combat{
  public static int health = 100;
  public static int power = 25;
  public static int defense = 25;

  /* Method use: In any room with an alien encounter, you need to define variables for the alien's health and power. Afterwards, call
   the method using Combat.fight(hp, pow, isFinalBoss) */
  public static void fight(int hp, int pow, boolean isFinalBoss){
    Scanner myScanner = new Scanner(System.in);
    String item = Inventory.chooseItem();
    ItemStats.stats(item);
    System.out.println(ItemStats.description);
    System.out.println("You hit the alien with your " + item + "!");
    int totalDamage = power + ItemStats.power;
    if(item == "banana") {
      if(!isFinalBoss) {
        totalDamage = 0;
        System.out.println("It does nothing... The alien starts laughing at you.");
      } else {
        Game.clearConsole();
        System.out.println("The alien picks up the banana and eats it.");
        System.out.println("It's face begins to turn blue as it cannot breathe.");
        System.out.println("...");
        System.out.println("The alien dies from a potassium allergy?");
        System.out.println();
        System.out.println("You feel a little healthier after the fight. Your health and resistance to damage have increased!");
        System.out.println();
        health = health + ((hp/5) + (int)Math.floor(Math.random()*6.0));
        defense = defense + hp/5;
        System.out.println("HP Remaining: "+ health);
        System.out.println("Current Defense: "+ defense);
        return;
      }
    }
    int healthRemaining = hp - totalDamage;
    if (healthRemaining > 0) {
      alienFight(pow);
      System.out.println("The alien has "+ healthRemaining + " health remaining!");
      System.out.println("He's not dead! You hit him again.");
      System.out.println("Press <enter> to continue...");
      String uselessVariable = myScanner.nextLine();
      Game.clearConsole();
      fight(healthRemaining, pow, false);
    } else {
    System.out.println("The alien is dead!");
    System.out.println();
    System.out.println("You feel a little healthier after the fight. Your health and resistance to damage have increased!");
    System.out.println();
    health = health + ((hp/5) + (int)Math.floor(Math.random()*6.0));
    defense = defense + hp/5;
    System.out.println("HP Remaining: "+ health);
    System.out.println("Current Defense: "+ defense);
    System.out.println();
    }
  }

  private static void alienFight(int alienPow){
    Scanner myScanner = new Scanner(System.in);
    System.out.println("The alien swings in retaliation!");
    System.out.println();
    int damage =  defense - ((int)Math.floor(Math.random()*6.0) + alienPow);
    health = health + damage;
    System.out.println("You took "+ damage/-1 +" points of damage!");
    if (health<=0) {
      System.out.println("You died. Beter luck next time!");
      return;
    } else {
      System.out.println("You now have "+ health +" health remaining!");
      System.out.println("Press <enter> to continue...");
      String uselessVariable = myScanner.nextLine();
    }
  }

  public static void randomEncounter() {
    double encounterChance = Math.random();
    if (encounterChance>0.90) {
      System.out.println();
      System.out.println("You run into an alien soldier!");
      System.out.println("Quick, hit him with something!");
      System.out.println();
      int alienHP = ThreadLocalRandom.current().nextInt(50, 100);
      int alienPow = ThreadLocalRandom.current().nextInt(20, 30);
      Combat.fight(alienHP, alienPow, false);
    }
  }

}
