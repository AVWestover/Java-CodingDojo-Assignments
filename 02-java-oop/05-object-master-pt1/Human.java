public class Human{
    //attributes
    private int strength = 3;
    private int stealth = 3;
    private int intelligence = 3;
    private int health = 100;
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