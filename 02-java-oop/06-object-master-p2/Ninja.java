public class Ninja extends Human{
    //attributes
    private int stealth = 10;
    //method steal/heal
    public void steal(Human enemy) {
        this.health = this.health + this.stealth;
        enemy.health = enemy.health - this.stealth;
    }
    //method run away
    public void runAway(){
        this.health = this.health - 10;
    }
}