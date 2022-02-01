public class Wizard extends Human{
    //attributes
    private int health = 50;
    private int intelligence = 8;
    //method - heal
    public void heal(Human friend){
        friend.health = friend.health + this.intelligence;
    }
    //method- fireball
    public void fireball(Human enemy){
        enemy.health = enemy.health - (this.intelligence * 3);
    }
    //
}