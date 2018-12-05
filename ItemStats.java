public class ItemStats{
  public static String description;
  public static int power;

  public static void stats(String item){
    switch(item){
      case "lead pipe":
        description = "You equip the pipe, feeling a surge of power! Your attack is increased!";
        power = 30;
        break;
      case "banana":
        description = "You pull the bananna out of your pocket and take aim at the alien! The alien looks confused.";
        power = 999;
        break;
      case "keycard":
        description = "You accidentally grab the keycard but it's too late to pick something else, might as well use it!";
        power = 1;
        break;
      case "fist":
        description = "Your inventory is empty! You'll have to use your fists!";
        power = 20;
        break;
      case "pumpkin"
        description = "You pull out the pumpkin, hoping to spook the alien. It doesn't work."
        power = 10;
        break;
    }
  }
}
