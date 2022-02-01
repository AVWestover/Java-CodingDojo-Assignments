public class Human{
    //attributes
    public static int strength = 3;
    public static int stealth = 3;
    public static int intelligence = 3;
    public static int health = 100;
    //method - attack
    public void attack(Human enemy) {
        enemy.health = enemy.health - this.strength;
    }
    //display health
    public int displayHealth() {
        System.out.println(this.health);
        return this.health;
    }
}