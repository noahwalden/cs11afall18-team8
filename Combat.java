public class Combat{
  private static int health = 100;
  private static int power = 25;
  private static int defense = 25;

  public static void fight(int hp, int pow){
    String item = Inventory.chooseItem();
    System.out.println("You hit the alien with your " + item + ".");
    int healthRemaining = hp - power;
    alienFight(pow);
    if (healthRemaining > 0) {
      System.out.println("The alien has "+ healthRemaining + " health remaining!");
      System.out.println("He's not dead! You hit him again.");
      fight(healthRemaining, pow);
    } else {
    System.out.println("The alien is dead.");
    System.out.println("HP Remaining: "+ health);
    }
  }

  private static void alienFight(int alienPow){
    System.out.println("The alien swings in retaliation!");
    System.out.println();
    int damage =  defense - ((int)Math.floor(Math.random()*6.0) + alienPow);
    health = health + damage;
    System.out.println("You took "+ damage/-1 +" points of damage!");
    System.out.println("You now have "+ health +" health remaining!");
  }
}
// Items Available: pipe, potions,
